module com.main.clickergame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.clickergame to javafx.fxml;
    exports com.main.clickergame;
}