package pl.teamjava.hotel.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable{
    @FXML
    private TextField textLogin;

    @FXML
    private PasswordField textPassword;

    @FXML
    private Hyperlink labelRegistration;

    @FXML
    private Hyperlink labelPasswordRecovery;

    @FXML
    private Hyperlink labelAuthor;

    @FXML
    private Button buttonLogin,buttonMainPage;


    public void initialize(URL location, ResourceBundle resources) {

    }

    private void tryLogin()  {
        String login = textLogin.getText();
        String password = textPassword.getText();
        if(!checkLoginData()){
            return;
        }
        if(userdao.login(login,password)){
            userSession.setUsername(login);
            userSession.setLogedIn(true);

            try {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));      // getClassLoader - przeszukuje wszystkie foldery w obrebie projektu


                Stage stageRoot = (Stage)buttonLogin.getScene().getWindow();
                stageRoot.close();
                //  stageRoot.setScene(new Scene(root, 600,400));
                Stage stage = new Stage();
                Scene scene=new Scene(root,600,400);
                stage.initStyle(StageStyle.DECORATED);
                stage.setTitle("Ksiązka telefoniczna");
                stage.setScene(scene);
//
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            Utils.createSimpleDialog("Logowanie","","Podano niepoprawne dane !");
        }

    }
    private boolean checkLoginData(){
        String login = textLogin.getText();
        String password = textPassword.getText();

        if(login.isEmpty()|| password.isEmpty()){
            Utils.createSimpleDialog("Logowanie","","Pola nie mogą być puste !");
        }
        if(login.length()<=3 || password.length() <=5){
            Utils.createSimpleDialog("Logowanie","","Dane za krótkie !");
            textLogin.clear();
            textPassword.clear();
        }
        return  true;
    }

}
