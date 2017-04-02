package hu.unideb.inf.petcenter.ui.handler;

import hu.unideb.inf.petcenter.db.entity.EntityManaging;
import hu.unideb.inf.petcenter.db.entity.PetShop;
import hu.unideb.inf.petcenter.db.entity.StoredUsers;
import hu.unideb.inf.petcenter.ui.surface.LoadSurface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class RegistryHandler implements Initializable {

    @FXML
    private TextField name;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label message;

    private List<PetShop> UsersList = new ArrayList<>();
    private StoredUsers users = new StoredUsers();

    @FXML
    public void register(ActionEvent event) {
        PetShop addnew = new PetShop();
        UsersList = users.storedUsers();
        for (PetShop userlist : UsersList){
            if(username.getText().equals(userlist.getUsername())){
                //If this user already exists.
                name.clear();
                username.clear();
                password.clear();
                return;
            }
        }
        if (name.getText().isEmpty() == true ||username.getText().isEmpty() == true || password.getText().isEmpty() == true){
            //If name, username or password missing.
            return;
        } else {
            addnew.setName(name.getText());
            addnew.setUsername(username.getText());
            addnew.setPassword(password.getText());
            EntityManaging ema = new EntityManaging();
            ema.em.persist(addnew);
            ema.em.getTransaction().commit();
            ema.em.close();
            message.setText("Success");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
