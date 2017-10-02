package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class BlockedListViewController implements Initializable {

    @FXML
    ListView<String> listBlocked;

    @FXML
    Button buttonRemove, buttonBack, buttonLogout;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
