package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login_option";
	}
	
	@GetMapping("/")
	public String home() {
		return "registration";
	}
	@GetMapping("/loginAsStudent")
	public String loginAsStudent() {
		return "login1";
	}
	@GetMapping("/loginAsTeacher")
	public String loginAsTeacher() {
		return "login";
	}
	@GetMapping("/startExam")
	public String startExam() {
		return "examOption";
	}
	@GetMapping("/java")
	public String java() {
		return "quiz2";
	}
	@GetMapping("/webDesignAndDevelopment")
	public String webDesignAndDevelopment() {
		return "quiz1";
	}
	@GetMapping("/databaseManagementSystem")
	public String webDesignAndDevelopment() {
		return "quiz1";
	}
}
