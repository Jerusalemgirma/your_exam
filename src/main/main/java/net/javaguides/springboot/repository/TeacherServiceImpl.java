package net.javaguides.springboot.repository;

import java.util.List;
import java.util.Optional;
import java.lang.Long;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.service.Teacher;


@Service
public class TeacherServiceImpl implements TeacherService {

    private static final Object Student = null;
    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }


    @Override
    public void saveTeacher(Teacher teacher) {
      this.teacherRepository.save(teacher);
    }
    @Override
    public Teacher getStudentByID (Long id){
        Optional<Teacher> optional= this.teacherRepository.findById(id);
            if(optional.isPresent()){
                return optional.get();
            }else{
                throw new RuntimeException( );
            }
    }
    @Override
    public void deleteStudentById(Long id){
        this.teacherRepository.deleteById(id);
    }


    @Override
    public void getStudentById(Long id) {
        // TODO Auto-generated method stub
        
    }
}
