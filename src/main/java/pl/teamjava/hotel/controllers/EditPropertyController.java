package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EditPropertyController implements Initializable {

    @FXML
    SplitMenuButton splitCategory, splitCity;

    @FXML
    Button buttonEdit, buttonBack, buttonLogout;

    @FXML
    ListView<String> listProperty;

    @FXML
    ScrollBar scrollProperty;

    @FXML
    TextField textName;

    @FXML
    CheckBox checkWifi, checkPets, checkPool, checkSpa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
