package com.example.checkingengine.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connect() throws SQLException {


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bookingsystem", "root","onu101cj");

        return con;

    }
}
