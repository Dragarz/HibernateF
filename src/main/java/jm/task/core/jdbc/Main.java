package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl ui = new UserDaoJDBCImpl();
        ui.createUsersTable();
        ui.saveUser("Ivan", "Levin", (byte)28);



    }


}
