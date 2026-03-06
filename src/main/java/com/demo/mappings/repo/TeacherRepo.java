package com.demo.mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mappings.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{

}
