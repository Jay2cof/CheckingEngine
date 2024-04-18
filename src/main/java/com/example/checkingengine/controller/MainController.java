package com.example.checkingengine.controller;


import com.example.checkingengine.connection.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class MainController {

    @FXML
    public Button btn_login;
    @FXML
    public Button btn_register;

    public void registerNewCustomer() throws IOException {

        Stage stage = (Stage) btn_register.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/checkingengine/register.fxml")));
        stage.setScene(new Scene(root, 707, 587));
        stage.setTitle("Registration");

    }
    @FXML
    public void customerLogin(){
        try{
            DBConnect.connect();
            System.out.println("Database Connected");
        }catch(SQLException j){
            j.printStackTrace();

        }
    }
}




