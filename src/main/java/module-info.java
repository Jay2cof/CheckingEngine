module com.example.checkingengine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkingengine to javafx.fxml;
    exports com.example.checkingengine;
<<<<<<< HEAD
=======
    exports com.example.checkingengine.controller;

>>>>>>> 48a08de (Booking Engine connecting both fxml files)
}