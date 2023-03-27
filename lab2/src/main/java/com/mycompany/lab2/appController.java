package com.mycompany.lab2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class appController {

    @FXML private Label labelcolor;
 
    @FXML
    private void kolor_nieb() {
    labelcolor.setTextFill(Color.BLUE);
    }
     @FXML
    private void kolor_ziel() {
    labelcolor.setTextFill(Color.GREEN);
    }
     @FXML
    private void kolor_czer() {
    labelcolor.setTextFill(Color.RED);
    }
    
     @FXML
    private void liczba1() {
    labelcolor.setText("1");
    }
    
     @FXML
    private void liczba2() {
    labelcolor.setText("2");
    }
    
     @FXML
    private void liczba3() {
    labelcolor.setText("3");
    }
    
    @FXML private ImageView obrazek;
    
    @FXML
    private void show_1() {
    obrazek.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
    }

    @FXML
    private void show_2() {
    obrazek.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
    }
    
    @FXML
    private void show_3() {
    obrazek.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
    }
    
     @FXML
    private void close() {
    Platform.exit();
    }
    
}
