package com.example.demoweek2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public ISpicy getAllSpicyMenu()
    {
        return new Food();
    }
    public void processSpicyMenu(ISpicy menu)
    {
        menu.toString();
    }

    @Override
    public void start(Stage stage) throws IOException {

        ISpicy spicyMenu= new Food ();
        spicyMenu= new Soup();


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("create-foodMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 540);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}