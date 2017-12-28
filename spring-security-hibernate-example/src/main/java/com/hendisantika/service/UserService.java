package com.hendisantika.service;

import com.hendisantika.model.UserDetails;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-hibernate-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.37
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {

    List<UserDetails> getUsers();

}
