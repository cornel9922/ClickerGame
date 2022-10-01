package com.main.clickergame;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import Animations.Shake;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private int health_bar;

    @FXML
    private ImageView mob_clicker;

    @FXML
    private Text money_count;

    @FXML
    private Button upgrade_1_clickPower;

    @FXML
    private Text upgrade_1_cost;

    @FXML
    private Button upgrade_2_autoClick;

    @FXML
    private Text upgrade_2_cost;

    @FXML
    private Text upgrade_3_cost;

    @FXML
    private Button upgrade_3_increment;
    private int money = 500;
    private int upgrade_1_clickPower_code = 1;
    private int upgrade_1_cost_code = 20;

    private int upgrade_2_autoClick_code = 0;
    private int upgrade_2_cost_code = 50;

    private int upgrade_3_increment_code = 0;


    @FXML
    void initialize() {
    // Initial money count
        money_count.setText(money + "¥");

    // Clicking on image adds money
        mob_clicker.setOnMouseClicked(event -> {
            money+= upgrade_1_clickPower_code;
            money_count.setText(money + "¥");
            Shake shake = new Shake(mob_clicker);
            shake.playAnim();
        });

    // Scheme of using upgrade 1 - click power
        upgrade_1_clickPower.setOnAction(event -> {

            if(money >= upgrade_1_cost_code) {
                money -= upgrade_1_cost_code;
                money_count.setText(money + "¥");

                upgrade_1_clickPower_code++;
                upgrade_1_clickPower.setText("Click lv" + upgrade_1_clickPower_code);

                upgrade_1_cost_code += upgrade_1_clickPower_code * 5;
                upgrade_1_cost.setText(upgrade_1_cost_code + "¥");
                Shake shake = new Shake(upgrade_1_clickPower);
                shake.playAnim();
                }

            else upgrade_1_cost.setText("You need " + upgrade_1_cost_code + "¥");
            });

    // Scheme of using upgrade 2 - autoclick power
        upgrade_2_autoClick.setOnAction(event -> {
            if (money >= upgrade_2_cost_code) {
                money -= upgrade_2_cost_code;
                money_count.setText(money + "¥");

                upgrade_2_autoClick_code++;
                upgrade_2_autoClick.setText("AutoClick lv" + upgrade_2_autoClick_code);

                upgrade_2_cost_code += upgrade_2_autoClick_code * 5;
                upgrade_2_cost.setText(upgrade_2_cost_code + "¥");
            }
        });

    // Scheme of using upgrade 3 - Increment all power




    }
}


