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
    private boolean checkRegisterData(){
        String loginR = textLoginR.getText();
        String passwordR =textPasswordR.getText();
        String passwordRepeatR = textPasswordRepeatR.getText();
        if(loginR.isEmpty()|| passwordR.isEmpty()||passwordRepeatR.isEmpty()){
            Utils.createSimpleDialog("Rejestracja","","Pola nie mogą być puste !");
            return false;
        }
        if(loginR.length()<=3 || passwordR.length() <=5){
            Utils.createSimpleDialog("Rejestracja","","Dane są za krótkie !");
            return false;
        }
        if(!passwordR.equals(passwordRepeatR)){
            Utils.createSimpleDialog("Rejestracja","","Hasła nie sa identyczne !");
            return false;
        }
        return  true;
    }
    private void tryRegister() {
        String loginR = textLoginR.getText();
        String passwordR =textPasswordR.getText();

        if(!checkRegisterData()){
            return;
        }

        if(userdao.register(loginR,passwordR)){
            Utils.createSimpleDialog("Rejestracja", "","Zarejestrowałeś się poprawnie");
        }else{
            Utils.createSimpleDialog("Rejestracja", "","Podany login już istnieje");
            textLoginR.clear();
            textPasswordR.clear();
        }

    }
}
