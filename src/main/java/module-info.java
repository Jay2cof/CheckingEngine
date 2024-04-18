module com.example.checkingengine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.checkingengine to javafx.fxml;
    exports com.example.checkingengine;

    exports com.example.checkingengine.controller;

}