module com.example.javafxsceneswitcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsceneswitcher to javafx.fxml;
    exports com.example.javafxsceneswitcher;
}