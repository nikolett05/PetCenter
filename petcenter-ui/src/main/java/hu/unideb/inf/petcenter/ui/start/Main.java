package hu.unideb.inf.petcenter.ui.start;

import hu.unideb.inf.petcenter.ui.surface.LoadSurface;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    LoadSurface load = new LoadSurface();

    @Override
    public void start(Stage primaryStage) throws Exception {
        load.loginScreen();
    }

    public static void main(String[] args){
        launch(args);
    }
}
