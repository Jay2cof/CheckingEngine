module com.example.checkingengine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkingengine to javafx.fxml;
    exports com.example.checkingengine;
}