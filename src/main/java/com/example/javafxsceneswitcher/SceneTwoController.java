package com.example.javafxsceneswitcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneTwoController
{
    @FXML
    private Button btnSwitch3;

    @FXML
    private void switchToScene3() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scene3-view.fxml"));
        Stage stage = (Stage) btnSwitch3.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Scene Three");
        stage.setScene(scene);
        stage.show();
    }

}
