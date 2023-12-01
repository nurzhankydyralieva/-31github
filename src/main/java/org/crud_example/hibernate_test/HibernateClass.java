package org.crud_example.hibernate_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HibernateClass {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("db.url", "db.user.name","db.password");
    }
}
