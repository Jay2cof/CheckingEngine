package com.example.checkingengine.controller;


import com.example.checkingengine.connection.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class MainController {

    @FXML
    TextField txt_loginEmail;

    @FXML
    PasswordField txt_loginPassword;

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
    public void customerLogin()throws IOException{
        try{

            //Connection con = DBConnect.connect();

            String email = txt_loginEmail.getText();
            String password = txt_loginPassword.getText();

            if (login(email,password)) {

                Stage stage = (Stage) btn_login.getScene().getWindow();
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/checkingengine/customerDashBoard.fxml")));
                stage.setScene(new Scene(root, 707, 587));
                stage.setTitle("Registration");

            }

            else{
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText("Please Use valid login details");
                error.show();
            }
            System.out.println("Database Connected");

        }catch(SQLException j){
            j.printStackTrace();

        }
    }

    public boolean login(String email, String password) throws SQLException{

        boolean login = false;

        Connection con = DBConnect.connect();
        String sql = "select email, password from customers where email = ? and password = ?";

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,email);
        statement.setString(2,password);
        ResultSet resultset = statement.executeQuery();

        while(resultset.next()){
            login = true;

        }
        return login;

    }
}






