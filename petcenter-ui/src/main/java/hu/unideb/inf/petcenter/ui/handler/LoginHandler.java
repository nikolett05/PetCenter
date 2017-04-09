package hu.unideb.inf.petcenter.ui.handler;

import hu.unideb.inf.petcenter.db.dao.PetShopDao;
import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.ui.surface.LoadSurface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LoginHandler implements Initializable{

    private LoadSurface load = new LoadSurface();
    private PetShopDao petShopDao = new PetShopDao();
    private List<PetShop> petShops;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label message;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void loginAction(ActionEvent actionEvent) throws IOException {
        petShops = petShopDao.getAll();
        for(PetShop petShop: petShops ){
            if(usernameField.getText().equals(petShop.getUsername()) && passwordField.getText().equals(petShop.getPassword())) {
                load.homeScreen();
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                break;
            } else {
                message.setText("Cannot Login!");
            }
        }

    }
    @FXML
    public void registryAction(ActionEvent actionEvent) throws IOException {
        load.registryScreen();
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
    }
}
