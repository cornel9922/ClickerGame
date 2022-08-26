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
    private Button money_upgrade;
    private int money = 0;
    @FXML
    void initialize() {
        mob_clicker.setOnMouseClicked(event -> {
            money++;
            money_count.setText(money + "$");
        });
    }

}
