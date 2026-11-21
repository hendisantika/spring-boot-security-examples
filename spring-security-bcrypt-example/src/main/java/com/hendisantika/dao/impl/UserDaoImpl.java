package com.hendisantika.dao.impl;

import com.hendisantika.dao.UserDao;
import com.hendisantika.model.UserDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-bcrypt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/01/18
 * Time: 15.48
 * To change this template use File | Settings | File Templates.
 */


@Repository
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserDetails> getUserDetails() {
        return entityManager.createQuery("SELECT u FROM UserDetails u", UserDetails.class)
                .getResultList();
    }

    public UserDetails findUserById(String userId) {
        return entityManager.createQuery("SELECT u FROM UserDetails u WHERE u.username = :username", UserDetails.class)
                .setParameter("username", userId)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

}
