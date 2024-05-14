module com.example.checkingengine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.checkingengine to javafx.fxml;
    exports com.example.checkingengine;

    exports com.example.checkingengine.controller;
    exports com.example.checkingengine.Auth;
    opens com.example.checkingengine.Auth to javafx.fxml;
    opens com.example.checkingengine.controller;

}