package com.wipro.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.User;

/*
 * RESTful Web Service.
 *
 * Note: For Spring MVC applications, use @Controller annotation and for
 * Spring REST applications, use @RestCOntroller annotation
 *
 * Note:
 * The methods of Controller class return name of the view template file ex. jsp file name
 *
 * The methods of RestController return data.
 *
 * HTTP methods for CRUD operations: GET, POST,PUT & DELETE
 */


@RestController
@RequestMapping("/uc")
public class UserController {

	//http://localhost:8081/spring-mvc-app/uc/hello

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, how are you";
	}

	//http://localhost:8081/spring-mvc-app/uc/users?username=admin&password=admin@123
	@GetMapping("/users")
	public String checkCredentials(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		User user = new User("admin","admin@123");

		if(username.equals(user.getUserName()) && password.equals(user.getPassword())) {
			return "Valid Credentials";
		}else {
			return "Invalid Credentials";
		}
	}

	//http://localhost:8081/spring-mvc-app/uc/users/admin/admin@123
		@GetMapping("/users/{username}/{password}")
		public String verifyCredentials( @PathVariable(value = "username") String username,
										 @PathVariable(value = "password") String password) {
			User user = new User("admin","admin@123");
			
			if(username.equals(user.getUserName()) && password.equals(user.getPassword())) {
				return "Valid Credentials";
			}else {
				return "Invalid Credentials";
			}
			
		}

		/* Following method receives User object from client application.
		 * The client application ex. postman has to send the User object JSON object.
		 *
		 * @RequestBody will receive JSON object and convert it to User object implicitly.
		 *
		 */
		
		@PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public User addUser(@RequestBody User user) {
			System.out.println(user.getUserName()+" saved");
			return user;
		}
		
		@PutMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public User changeUser(@RequestBody User user) {
			User existingUser = new User("admin","admin@123");
			
			System.out.println(existingUser.getPassword());
			if(user.getUserName().equals(existingUser.getUserName())) {
				existingUser.setPassword(user.getPassword());
			}
			
			System.out.println(existingUser.getPassword());
			
			return existingUser;
		}
		
		@DeleteMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public String deleteUser(@RequestBody User user) {
			User existingUser = new User("admin","admin@123");
			if(user.getUserName().equals(existingUser.getUserName())  &&
					user.getPassword().equals(existingUser.getPassword())) {
				
				return existingUser.getUserName()+ " deleted";
			}else {
				return "Cannot delete the user";
			}
		}



}
