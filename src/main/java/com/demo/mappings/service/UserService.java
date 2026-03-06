package com.demo.mappings.service;

import java.util.List;

import com.demo.mappings.entity.Teacher;
import com.demo.mappings.entity.User;

public interface UserService {

	User addUser(User user);
	
	List<User> getUser();
	
	Teacher addTeacher(Teacher teacher);
}
