package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        u.createUsersTable();

    }

    public void dropUsersTable() {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        u.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        u.saveUser(name,lastName,age);

    }

    public void removeUserById(long id) {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        u.removeUserById(id);

    }

    public List<User> getAllUsers() {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        return u.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDaoHibernateImpl u = new UserDaoHibernateImpl();
        u.cleanUsersTable();
    }
}
