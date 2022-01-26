package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.service.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long>{
    
}
