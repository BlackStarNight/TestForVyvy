package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class TestController {

    @FXML
    private Text counter;

    @FXML
    private Button counter_subtract;

    @FXML
    private Button counter_add;

    @FXML
    void initialize(){

        counter_add.setOnAction(event -> {
            if (Integer.parseInt(counter.getText()) != 40) {
                    counter.setText(String.valueOf((Integer.parseInt(counter.getText()) + 1)));
            }
        });

        counter_subtract.setOnAction(event -> {
            if (Integer.parseInt(counter.getText()) != 1) {
                counter.setText(String.valueOf((Integer.parseInt(counter.getText()) - 1)));
            }
        });


    }


}
