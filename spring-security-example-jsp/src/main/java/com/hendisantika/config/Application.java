package com.hendisantika.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/12/17
 * Time: 06.08
 * To change this template use File | Settings | File Templates.
 */

//This is a convenience annotation that is equivalent to 
//declaring @Configuration, @EnableAutoConfiguration and @ComponentScan.
@ComponentScan(basePackages = "com.hendisantika")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}