package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    public static Stage TestStage;
    public static Stage MenuStage;




    @Override
    public void start(Stage primaryStage) throws Exception{
        TestStage = Loading.loading("Test.fxml", "Test");
        MenuStage = Loading.loading("sample.fxml", "Menu");
        TestStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
