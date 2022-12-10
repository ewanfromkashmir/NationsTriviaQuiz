package com.example.javafxsceneswitcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneThreeController
{
    @FXML
    private Button btnSwitch1;

    @FXML
    private void switchToScene1() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scene1-view.fxml"));
        Stage stage = (Stage) btnSwitch1.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Scene One");
        stage.setScene(scene);
        stage.show();
    }
}
