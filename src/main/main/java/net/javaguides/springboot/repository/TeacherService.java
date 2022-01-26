package net.javaguides.springboot.repository;

import java.util.List;


import net.javaguides.springboot.service.Teacher;

import java.lang.Long;


public interface TeacherService {
    List<Teacher>getAllTeachers();
    void saveTeacher(Teacher student) ;
    Teacher getStudentByID(Long id);
    void deleteStudentById(Long id);
     void getStudentById(Long id);
    
   
    
}
