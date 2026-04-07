package com.demo.mappings.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.mappings.entity.Teacher;
import com.demo.mappings.entity.User;
import com.demo.mappings.service.UserService;

@RequestMapping
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User user2 = userService.addUser(user);
		return new ResponseEntity<User>(user2,HttpStatus.CREATED);
	}
	
	@PostMapping("/addTeacher")
	public ResponseEntity<Teacher> addUser(@RequestBody Teacher teacher) {
		Teacher teacher2 = userService.addTeacher(teacher);
		return new ResponseEntity<Teacher>(teacher2,HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<User>> getUsers(){
		List<User> user = userService.getUser();
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
	}
}
