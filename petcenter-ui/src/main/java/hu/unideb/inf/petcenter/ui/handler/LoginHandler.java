package hu.unideb.inf.petcenter.ui.handler;

import hu.unideb.inf.petcenter.ui.surface.LoadSurface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginHandler implements Initializable{

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    LoadSurface load = new LoadSurface();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void loginAction(ActionEvent actionEvent) {

    }
    @FXML
    public void registryAction(ActionEvent actionEvent) throws IOException {
        load.registryScreen();
    }
}
