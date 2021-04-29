package jm.task.core.jdbc.util;

import java.io.Closeable;
import java.io.IOException;
import java.sql.*;

public class Util implements Closeable {
    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "Dragarz";
    private final String PASSWORD = "Dragarz";
    private Connection connection;
    private Statement statement;
   // private PreparedStatement preparedStatement = null;
    public Util(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Статуст соединения: " + !connection.isClosed());
            statement = connection.createStatement();
            System.out.println("Статус подключения команд: " + !statement.isClosed());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public Connection getConnection(){

        return connection;
    }
    public Statement getStatement(){
        return statement;
    }

    @Override
    public void close() throws IOException {
        try {
            connection.close();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
