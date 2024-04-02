package com.example.checkingengine.controller;

<<<<<<< HEAD
public class MainController {
=======
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController{
    @FXML
    public Button btn_login;
    @FXML
    public Button btn_register;

    @FXML
    public void registerNewCustomer(Stage registration){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene scene = new Scene(root);
            registration.setScene(scene);
            registration.setTitle("Registration Page");
            registration.show();
        }
        catch (Exception J){
            J.printStackTrace();
        }

    }



>>>>>>> 48a08de (Booking Engine connecting both fxml files)
}
