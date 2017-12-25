package com.hendisantika.controller;

import com.hendisantika.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/12/17
 * Time: 06.23
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView model = new ModelAndView();
        model.addObject("users", getUsers());
        model.setViewName("dashboard");
        return model;
    }

    private List<User> getUsers() {
        User user = new User();
        user.setEmail("uzumaki_naruto@gmail.com");
        user.setName("Uzumaki Naruto");
        user.setAddress("Konohagakure, Japan");

        User user1 = new User();
        user1.setEmail("monkey_d_luffy@onepiece.com");
        user1.setName("Monkey D Luffy");
        user1.setAddress("One Piece, Japan");

        User user2 = new User();
        user2.setEmail("uchiha_sasuke@konohagakure.com");
        user2.setName("Uchiha Sasuke");
        user2.setAddress("Konohagakure, Japan");

        User user3 = new User();
        user3.setEmail("hatake_kakashi@konohagakure.com");
        user3.setName("Hatake Kakashi");
        user3.setAddress("Konohagakure, Japan");

        return Arrays.asList(user, user1, user2, user3);
    }

}
