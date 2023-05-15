package com.example.demoweek2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//hide the last label
    }

    /*
    *This method provide a list of spicy level
    *@return Spicy Levels
    * */
    public static List<String> getSpicyLevels()
    {
        return Arrays.asList("None","Mild","SPICY","HOT","EXTRA HOT");
    }
}