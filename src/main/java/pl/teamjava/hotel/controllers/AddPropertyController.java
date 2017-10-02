package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPropertyController implements Initializable {

    @FXML
    TextField textName, textCity, textRegion;

    @FXML
    SplitMenuButton splitCategory;

    @FXML
    CheckBox checkboxWifi, checkboxPets, checkboxPool, checkboxSpa;

    @FXML
    Button buttonBack, buttonLogout, buttonAdd;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
