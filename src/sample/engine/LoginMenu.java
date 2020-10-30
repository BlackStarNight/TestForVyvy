package sample.engine;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginMenu {

    @FXML
    private TextField loginNameField;

    @FXML
    private Button but;

    @FXML
    public void initialize(){
        if (loginNameField.getText() != null) {
            loginNameField.setText(Controller.loginName);
        }

        but.setOnAction(event -> {
            if (loginNameField.getText() != null) {
                Controller.loginName = loginNameField.getText();
            } else {
            }
            ((Stage) but.getScene().getWindow()).close();
        });
    }

}
