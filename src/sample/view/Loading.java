package sample.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Loading extends Application {
    public static Stage loading(String resource, String title,int w,int h) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(resource));
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root, w, h));
        return stage;
    }

    public static Stage loading(String resource, String title) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(resource));
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        return stage;
    }
}
