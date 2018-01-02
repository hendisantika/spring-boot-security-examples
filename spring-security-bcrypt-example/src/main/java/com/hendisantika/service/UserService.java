package com.hendisantika.service;

import com.hendisantika.model.UserDetails;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-bcrypt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/18
 * Time: 15.50
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {

    List<UserDetails> getUsers();

}
