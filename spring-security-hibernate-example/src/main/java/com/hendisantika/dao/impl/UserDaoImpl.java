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
 * Project : spring-security-hibernate-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/12/17
 * Time: 06.36
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

    public UserDetails findUserByEmail(String email) {
        return entityManager.createQuery("SELECT u FROM UserDetails u WHERE u.email = :email", UserDetails.class)
                .setParameter("email", email)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

}
