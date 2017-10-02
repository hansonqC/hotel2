package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SplitMenuButton;

import java.net.URL;
import java.util.ResourceBundle;

public class reservationViewController implements Initializable {

    @FXML
    Button buttonLogout, buttonCancel, buttonShowProfile, buttonBack;

    @FXML
    ScrollBar scrollReservation;

    @FXML
    ListView<String> listReservation;

    @FXML
    SplitMenuButton splitProperty;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
