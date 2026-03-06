package com.demo.mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.mappings.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>{

}
