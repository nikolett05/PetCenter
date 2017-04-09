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

public class RegistryHandler implements Initializable {

    private PetShopDao petShopDao = new PetShopDao();
    private LoadSurface load = new LoadSurface();

    @FXML
    private TextField name;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordAgain;

    @FXML
    private Label message;

    private List<PetShop> petShops;

    @FXML
    public void register(ActionEvent event) throws IOException {
        petShops = petShopDao.getAll();
        for (PetShop pet : petShops) {
            if (username.getText().equals(pet.getUsername())) {
                message.setText("Username already exists");
                return;
            }
        }
        if (name.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
            message.setText("Filling all fields required!");
            return;
        } else if(!password.getText().equals(passwordAgain.getText())) {
            message.setText("The passwords do not match");
            return;
        }else {
            PetShop newPetShop = new PetShop();
            newPetShop.setName(name.getText());
            newPetShop.setUsername(username.getText());
            newPetShop.setPassword(password.getText());
            petShopDao.insert(newPetShop);
            load.loginScreen();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
