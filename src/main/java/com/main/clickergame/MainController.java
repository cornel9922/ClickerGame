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
    private int money = 0;
    private int upgrade_1_clickPower_code = 1;
    private int upgrade_1_cost_code = 20;
    @FXML
    void initialize() {
            upgrade_1_clickPower.setOnAction(event -> {
                if(money >= upgrade_1_cost_code) {
                    money -= upgrade_1_cost_code;

                    money_count.setText(money + "$");
                    upgrade_1_clickPower_code++;
                    upgrade_1_clickPower.setText("Click power = " + upgrade_1_clickPower_code);

                    upgrade_1_cost_code = 20 * upgrade_1_clickPower_code;
                    upgrade_1_cost.setText(upgrade_1_cost_code + "$");

                }
            });

        mob_clicker.setOnMouseClicked(event -> {
            money+= upgrade_1_clickPower_code;
            money_count.setText(money + "$");
        });
    }

}
