package hu.unideb.inf.petcenter.ui.surface;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoadSurface {
    private FXMLLoader loader = new FXMLLoader();
    private Stage stage = new Stage();

    public void registryScreen() throws IOException {
        Pane parent = loader.load(getClass().getResource("/fxml/PetShopRegistry.fxml").openStream());
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Registration");
        stage.show();
    }
}
