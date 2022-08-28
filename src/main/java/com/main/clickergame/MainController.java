package com.main.clickergame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
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
    private Button upgrade_3_image;
    private int money = 50;
    private int upgrade_1_clickPower_code = 1;
    private int upgrade_1_cost_code = 5;

    private int upgrade_2_autoClickPower_code = 0;
    private int upgrade_2_cost_code = 50;
    @FXML
    void initialize() {
        upgrade_1_clickPower.setOnAction(event -> {
            if(money >= upgrade_1_cost_code) {
                money -= upgrade_1_cost_code;
                money_count.setText(money + "¥");

                upgrade_1_clickPower_code++;
                upgrade_1_clickPower.setText("Click lv" + upgrade_1_clickPower_code);

                upgrade_1_cost_code = (20*upgrade_1_clickPower_code)/3;
                upgrade_1_cost.setText(upgrade_1_cost_code + "¥");
                }
//            if(money >= 100) {
//                upgrade_2_cost.setVisible(true);
//                upgrade_2_cost.setText(upgrade_2_cost_code + "¥");
//                upgrade_2_autoClick.setText("Autoclicker lv" + upgrade_2_autoClickPower_code);
//            }
            });

        mob_clicker.setOnMouseClicked(event -> {
            money+= upgrade_1_clickPower_code;
            money_count.setText(money + "¥");
        });

//        upgrade_2_autoClick.setOnAction(event -> {
//            if (money >= 100) {
//
//                money -= upgrade_2_cost_code;
//
//                upgrade_2_cost_code += 50;
//            }
//        });

    }

}
