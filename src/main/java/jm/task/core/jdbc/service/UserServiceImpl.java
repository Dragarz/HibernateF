package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.createUsersTable();

    }

    public void dropUsersTable() {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.saveUser(name,lastName,age);

    }

    public void removeUserById(long id) {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.removeUserById(id);

    }

    public List<User> getAllUsers() {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        return u.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.cleanUsersTable();
    }
}
