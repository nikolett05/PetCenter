package hu.unideb.inf.petcenter.ui.handler;

import hu.unideb.inf.petcenter.db.dao.PetShopDao;
import hu.unideb.inf.petcenter.db.entity.PetShop;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistryHandler implements Initializable {

    PetShopDao petShopDao = new PetShopDao();


    @FXML
    private TextField name;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label message;

    @FXML
    public void register(ActionEvent event) {
        PetShop newPetShop = new PetShop();
        newPetShop.setName(name.getText());
        newPetShop.setUsername(username.getText());
        newPetShop.setPassword(password.getText());
        petShopDao.insert(newPetShop);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
