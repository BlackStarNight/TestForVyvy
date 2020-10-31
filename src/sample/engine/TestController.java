package sample.engine;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javax.swing.*;
import javax.swing.text.html.StyleSheet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestController {

    public static String[][] XD = new String[50][];



    @FXML
    private Text counter;

    @FXML
    private Button counter_subtract;

    @FXML
    private Button counter_add;

    @FXML
    private Text min;

    @FXML
    private Text sec;

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


        timer1.start();
    }




    Timer timer1 = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (Integer.parseInt(sec.getText()) == 0){
                min.setText(String.valueOf(Integer.parseInt(min.getText())-1));
                sec.setText("59");
            } else {
                if (Integer.parseInt(sec.getText()) < 11){
                    sec.setText("0"+(Integer.parseInt(sec.getText()) - 1));
                } else
                sec.setText(String.valueOf(Integer.parseInt(sec.getText())-1));
            }


        }
    });


    public void readFile(String link) throws FileNotFoundException {
        File file = new File(link);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);


    }





//    private boolean timer_reach(){
//        if (timer_s == 0) {
//            timer_s = System.currentTimeMillis();
//            timer_f = timer_s + timer_d;
//        }
//        if (timer_f <= System.currentTimeMillis()) {
//            timer_s = 0;
//            return true;
//        }
//        else return false;
//    }
//
//
//    public void timer_play (){
//        if (timer_p == 0 ){
//            timer_p = System.currentTimeMillis();
//            timer_f = timer_p + timer_d;
//        }
//        if (timer_f <= System.currentTimeMillis()) {
//            this.stop();
//            timer_p = 0;
//        }
//    }


}
