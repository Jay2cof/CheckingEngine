package com.example.checkingengine.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connect() throws SQLException {
<<<<<<< HEAD
        Connection con = DriverManager.getConnection("jdbc://localhost/checkingengine",
                "root","onu101cj");
=======
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bookingsystem", "root","onu101cj");
>>>>>>> 6a25524 (Booking Engine connecting both fxml files connecting to the database)
        return con;

    }
}
