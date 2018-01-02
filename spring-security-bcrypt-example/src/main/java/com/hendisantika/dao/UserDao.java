package com.hendisantika.dao;

import com.hendisantika.model.UserDetails;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-bcrypt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/18
 * Time: 15.46
 * To change this template use File | Settings | File Templates.
 */

public interface UserDao {

    List<UserDetails> getUserDetails();

    UserDetails findUserById(String userId);

}
