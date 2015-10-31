package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{
    Stage lava = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {
        eestiLipp();
        jaapaniLipp();
    }

    private void jaapaniLipp() {
        Stage lava = new Stage();
        Pane pane = new Pane();

        Rectangle kast1 = new Rectangle(0,0, 600, 300);
        kast1.setFill(Color.WHITE);

        Circle ring = new Circle(300, 150, 100);
        ring.setFill(Color.RED);

        pane.getChildren().addAll(kast1, ring);

        Scene stseen = new Scene(pane, 600, 300);
        lava.setScene(stseen);
        lava.show();
    }

    private void eestiLipp() {
        Stage lava = new Stage();
        Pane pane = new Pane();

        Rectangle sinine = new Rectangle(0,0, 900, 300);
        sinine.setFill(Color.BLUE);

        Rectangle must = new Rectangle(0,300, 900, 300);
        must.setFill(Color.BLACK);

        Rectangle valge = new Rectangle(0,600, 900, 300);
        valge.setFill(Color.WHITE);

        pane.getChildren().addAll(sinine, must, valge);

        Scene stseen = new Scene(pane, 900, 900);
        lava.setScene(stseen);
        lava.show();
    }
}
