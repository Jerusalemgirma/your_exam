package net.javaguides.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.repository.Student;
import net.javaguides.springboot.repository.TeacherService;
import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	@Autowired
    private TeacherService teacherService;
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
    @GetMapping("/")
    public String viewHomePage(Model model){
		model.addAttribute("listTeachers", teacherService.getAllTeachers());
        return "TeacherMan";
    }
    @GetMapping("/new")
    public String showNewStudentForm(Model model){
        model.addAttribute("student" , "student");
        return "new_student";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){
        // this.teacherService.saveTeacher(student);
        return "redirect:/";
    }
    @GetMapping("/showFormFORUpdate/{/id}")
    public String showFormForUpdate(@PathVariable (value = "id") Long id , Model model){
    this.teacherService.getStudentById(id);
    model.addAttribute("student", "student");
    return"update_student";
}
@GetMapping("/deleteStudent{is}")
public String deleteStudent(@PathVarieble (value="id") Long id){
	this.teacherService.deleteStudentById(id);
	return "redirect:/";
}

}
