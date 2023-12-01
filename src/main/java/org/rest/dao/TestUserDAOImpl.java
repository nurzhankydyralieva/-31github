package org.rest.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.rest.model.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestUserDAOImpl implements UserDAOTest {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UserTest> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        Query<UserTest> fromUser = session.createQuery("FROM UserTest ", UserTest.class);
        List<UserTest> allUser = fromUser.getResultList();

        return allUser;
    }

    @Override
    public void saveUser(UserTest user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public UserTest getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        UserTest user = session.get(UserTest.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("DELETE FROM UserTest WHERE id =:userID");
        query.setParameter("userID", id);
        query.executeUpdate();
    }
}
