package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SplitMenuButton;

import java.net.URL;
import java.util.ResourceBundle;

public class DeleteRoomController implements Initializable {

    @FXML
    SplitMenuButton splitName, splitCity;

    @FXML
    Button buttonDelete, buttonBack, buttonLogout;

    @FXML
    ListView<String> listProperty;

    @FXML
    ScrollBar scrollProperty;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
