package com.demo.mappings.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mappings.entity.Course;
import com.demo.mappings.entity.Profile;
import com.demo.mappings.entity.Teacher;
import com.demo.mappings.entity.User;
import com.demo.mappings.repo.TeacherRepo;
import com.demo.mappings.repo.UserRepo;
import com.demo.mappings.service.UserService;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private TeacherRepo teacherRepo;
	
	@Override
	public User addUser(User user) {
		Profile profile = user.getProfile();
		 if (profile != null) {
		        profile.setUser(user);   // VERY IMPORTANT
		    }
		return userRepo.save(user);
	}

	@Override
	public List<User> getUser() {
		
		return userRepo.findAll();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {

	    List<Course> courses = teacher.getCourses();

	    if (courses != null) {
	        for (Course course : courses) {
	            course.setTeacher(teacher);  // VERY IMPORTANT
	        }
	    }

	    return teacherRepo.save(teacher);
	}


}
