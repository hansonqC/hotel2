package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class addRoomController implements Initializable {

    @FXML
    TextField textName, textPrice;

    @FXML
    SplitMenuButton splitCategory, splitCapacity, splitPlaceName;

    @FXML
    Button buttonAdd, buttonLogout, buttonBack;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
