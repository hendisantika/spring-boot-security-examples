package com.hendisantika.service.impl;

import com.hendisantika.dao.UserDao;
import com.hendisantika.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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

@Component(value = "userDetailService")
public class UserDetailServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserDao userDao;

    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        com.hendisantika.model.UserDetails user = userDao.findUserById(userId);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getId(), user.getPassword(), getAuthority());
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    public List<com.hendisantika.model.UserDetails> getUsers() {
        return userDao.getUserDetails();
    }

}
