package com.example.testproject;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class TestController
{
    @javafx.fxml.FXML
    private Text text;

    @javafx.fxml.FXML
    public void initialize() {
        text.setText("This is OOP Tutorial");
    }

    @javafx.fxml.FXML
    public void handleOnHelloButton(ActionEvent actionEvent) {
        text.setText("Welcome to the OOP Course!");
        System.out.println("Welcome to the OOP Course!");
    }
}