package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EditRoomController implements Initializable {

    @FXML
    SplitMenuButton splitName, splitCategory, splitCity, splitCapacity;

    @FXML
    Button buttonEdit, buttonBack, buttonLogout;

    @FXML
    ListView<String> listRoom;

    @FXML
    ScrollBar scrollRoom;

    @FXML
    TextField textName, textPrice;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
