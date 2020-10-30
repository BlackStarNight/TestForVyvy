package sample.engine;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginFalse {

    @FXML
    private Button but;


    @FXML
    public void initialize(){
        but.setOnAction(event -> {
            ((Stage) but.getScene().getWindow()).close();
        });
    }
}