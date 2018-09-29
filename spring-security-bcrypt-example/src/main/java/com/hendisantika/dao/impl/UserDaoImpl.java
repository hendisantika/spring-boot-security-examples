package com.hendisantika.dao.impl;

import com.hendisantika.dao.UserDao;
import com.hendisantika.model.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<UserDetails> getUserDetails() {
        Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
        return criteria.list();
    }

    public UserDetails findUserById(String userId) {
        UserDetails userDetails = null;
        Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
        criteria.add(Restrictions.eq("username", userId));
        List<UserDetails> entityList = criteria.list();
        if (!entityList.isEmpty()) {
            userDetails = entityList.get(0);
        }
        return userDetails;
    }

}
