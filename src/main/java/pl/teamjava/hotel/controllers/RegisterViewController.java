package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by lukasz on 2017-10-01.
 */
public class RegisterViewController implements Initializable {
    @FXML
    private Hyperlink labelAuthorR;

    @FXML
    private Button buttonLogin,buttonMainPageR;

    @FXML
    private TextField textNameR,textSurnameR,textEmailR,textCodeR,TelephoneR;

    @FXML
    private PasswordField textPasswordR,textPasswordRepeatR;

    @FXML
    private CheckBox checkBoxTermsAccept,checkBoxEmailsAccept;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
