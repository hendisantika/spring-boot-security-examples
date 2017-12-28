package com.hendisantika.dao;

import com.hendisantika.model.UserDetails;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-hibernate-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.36
 * To change this template use File | Settings | File Templates.
 */

public interface UserDao {

    List<UserDetails> getUserDetails();

    UserDetails findUserById(String userId);

}
