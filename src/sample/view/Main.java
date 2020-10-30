package sample.view;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.view.Loading;

public class Main extends Application {
    public static Stage TestStage;
    public static Stage MenuStage;




    @Override
    public void start(Stage primaryStage) throws Exception{
        TestStage = Loading.loading("Test.fxml", "Test");
        MenuStage = Loading.loading("sample.fxml", "Menu");
        MenuStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
