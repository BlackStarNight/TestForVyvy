package sample.engine;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.view.Loading;
import sample.view.Main;

import java.io.IOException;

import static sample.view.Main.MenuStage;
import static sample.view.Main.TestStage;

public class Controller {

    public static String loginName = null;

    @FXML
    private Button testBut;

    @FXML
    private Button exit;

    @FXML
    private Button login;




    @FXML
    public void initialize(){
        testBut.setOnAction(event -> {
            if(testStartCheck()) {
                MenuStage.hide();
                TestStage.show();
            } else {
                try {
                    Stage loginFalse = Loading.loading("LoginFalse.fxml", "False Login");
                    loginFalse.setResizable(false);
                    loginFalse.initModality(Modality.WINDOW_MODAL);
                    loginFalse.initOwner(MenuStage);
                    loginFalse.show();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        exit.setOnAction(event -> {
            MenuStage.close();
        });
        login.setOnAction(event -> {
            try {
                Stage loginMenu = Loading.loading("LoginMenu.fxml", "Login");
                loginMenu.setResizable(false);
                loginMenu.initModality(Modality.WINDOW_MODAL);
                loginMenu.initOwner(MenuStage);
                loginMenu.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    public static boolean testStartCheck(){
        if (loginName != null)
            return true;
        else return false;
    }

}
