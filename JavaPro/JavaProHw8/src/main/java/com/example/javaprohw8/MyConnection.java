package com.example.javaprohw8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {


    static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/hw7";
    static final String DB_USER = "postgres";
    static final String DB_PASSWORD = "student123";

    public static   Connection createConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        return connection;
    }



}
