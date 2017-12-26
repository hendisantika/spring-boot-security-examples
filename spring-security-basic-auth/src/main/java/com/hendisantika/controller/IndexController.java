package com.hendisantika.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-basic-auth
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.50
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    String index() {
        return "Hello Kawan2! " + new Date();
    }
}
