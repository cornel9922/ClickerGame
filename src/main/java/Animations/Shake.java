package Animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {

    private int count;
    private TranslateTransition tt;

    public Shake(Node node) {;
        tt = new TranslateTransition(Duration.millis(70), node);
            tt.setFromX(0f);
            tt.setByX(5f);
            tt.setCycleCount(1);
            tt.setAutoReverse(true);
    }

    public void playAnim() {
        tt.playFromStart();
    }

}
