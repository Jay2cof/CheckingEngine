package com.example.checkingengine.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class RegisterController {
    @FXML
    public Button Btn_Login;

    @FXML
    public void login() throws IOException{
        Stage stage = (Stage) Btn_Login.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/checkingengine/mainFile.fxml")));
        stage.setScene(new Scene(root, 700, 454));
        stage.setTitle("Login");;
    }

}
