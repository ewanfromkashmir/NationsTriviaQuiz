package com.example.javafxsceneswitcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneOneController
{
    @FXML
    private Button btnSwitch2;

    @FXML
    private void switchToScene2() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scene2-view.fxml"));
        Stage stage = (Stage) btnSwitch2.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Scene Two");
        stage.setScene(scene);
        stage.show();
    }
}