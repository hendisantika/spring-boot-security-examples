package com.hendisantika.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-hibernate-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.18
 * To change this template use File | Settings | File Templates.
 */


@ComponentScan(basePackages = "com.hendisantika")
@SpringBootApplication
@EntityScan(basePackages = "com.hendisantika.model")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}