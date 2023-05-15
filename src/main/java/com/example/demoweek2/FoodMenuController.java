package com.example.demoweek2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class FoodMenuController implements Initializable {

    @FXML
    private ComboBox<String> demoCom;

    @FXML
    private TextField foodNameTextField;

    @FXML
    private Label msgLabel;

    @FXML
    private TextField priceTextField;

    @FXML
    private Spinner<Integer> spicyLevelSpinner;

    @FXML
    void clickedSubmit(ActionEvent event) {
        String foodName = foodNameTextField.getText();
        double price = 0;
        int spicyLevel = spicyLevelSpinner.getValue();
        /**
         * if the input price not numeric, handle exception
         */
        try {
            price = Double.parseDouble(priceTextField.getText());
        }
        catch (Exception e)
        {
            msgLabel.setText(" Price must be numbers only");
        }
        if (price >=1 && price <=100) {
            FoodMenu foodMenu = new FoodMenu(foodName, price, spicyLevel);

            msgLabel.setText(foodMenu.toString());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msgLabel.setText("");
        spicyLevelSpinner.setEditable(true);

        //Only demo
        demoCom.getItems().addAll(Arrays.asList("None","Mild","Hot","Extreme"));
    }


}

