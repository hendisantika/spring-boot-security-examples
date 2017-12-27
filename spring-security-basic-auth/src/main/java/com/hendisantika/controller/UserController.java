package com.hendisantika.controller;

import com.hendisantika.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-basic-auth
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.28
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class UserController {
	
	@RequestMapping(path="/user", method = RequestMethod.GET)
	public ResponseEntity<List<User>>  listUser(){
		return new ResponseEntity<List<User>>(getUsers(), HttpStatus.OK);
	}
	
	@RequestMapping(path="/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User>  listUser(@PathVariable(value = "id") String id){
		return new ResponseEntity<User>(getUsers().stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null), HttpStatus.OK);
		
	}
	
	@RequestMapping(path="/user", method = RequestMethod.POST)
	public ResponseEntity<String>  listUser(@RequestBody User user){
		return new ResponseEntity<String>("18", HttpStatus.OK);
	}
	
	private List<User> getUsers() {
        User user = new User();
        user.setId("1");
        user.setEmail("uzumaki_naruto@gmail.com");
        user.setName("Uzumaki Naruto");
        user.setAddress("Konohagakure, Japan");

        User user1 = new User();
        user1.setId("2");
        user1.setEmail("monkey_d_luffy@onepiece.com");
        user1.setName("Monkey D Luffy");
        user1.setAddress("One Piece, Japan");

        User user2 = new User();
        user2.setId("3");
        user2.setEmail("uchiha_sasuke@konohagakure.com");
        user2.setName("Uchiha Sasuke");
        user2.setAddress("Konohagakure, Japan");

        User user3 = new User();
        user3.setId("4");
        user3.setEmail("hatake_kakashi@konohagakure.com");
        user3.setName("Hatake Kakashi");
        user3.setAddress("Konohagakure, Japan");
		return Arrays.asList(user, user1, user2, user3);
	}


}
