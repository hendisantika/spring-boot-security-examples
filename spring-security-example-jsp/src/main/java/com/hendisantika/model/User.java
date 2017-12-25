package com.hendisantika.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/12/17
 * Time: 06.20
 * To change this template use File | Settings | File Templates.
 */

public class User {

    private String name;
    private String address;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
