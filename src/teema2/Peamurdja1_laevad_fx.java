package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */

public class Peamurdja1_laevad_fx extends Application{
    Stage lava;
    GridPane laud;
    int lauaPikkusLaevades = 4;
    int laevaServPikslites = 50;
    int stseeniPikkus = lauaPikkusLaevades * laevaServPikslites;
    int stseeniLaius = lauaPikkusLaevades * laevaServPikslites;
    Image pilt = new Image("teema2/pirate.png");
    ImagePattern pattern = new ImagePattern(pilt);
    StackPane maailm;



    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();
        paigutaLaevad();
        reageeriKlikile();
        laevuOnAlles();
        //gameover();

    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruuduId = ruut.getId();
            if (ruuduId.equals("laev")) {
                ruut.setFill(pattern);
                ruut.setId("pihtas");
            } else if (ruuduId.equals("meri")) {
                System.out.println("Mööda");
                ruut.setFill(Color.DARKBLUE);
            } else if (ruuduId.equals("pihtas")) {
                System.out.println("Kõmmutad laipa");
            }
            if (!laevuOnAlles()) {
                gameover();
            }
        });
    }

    private void gameover() {
        Label lopp = new Label("Lõpp");
        lopp.setFont(new Font(30));
        lopp.setTextFill(Color.RED);
        maailm.getChildren().add(lopp);
    }

    private boolean laevuOnAlles() {
        for (Node ruut : laud.getChildren()){
            if (ruut.getId().equals("laev")){
                return true;
            }
        }
        return false;
    }

    private void paigutaLaevad() {
        for (int i = 0; i < lauaPikkusLaevades; i++) {
            for (int j = 0; j < lauaPikkusLaevades; j++) {
                Rectangle ruut = new Rectangle(laevaServPikslites, laevaServPikslites);
                int rand = (int) (Math.random() * 2);
                if (rand == 1){
                    ruut.setId("laev");
                } else if (rand == 0){
                    ruut.setId("meri");
                }
                ruut.setStroke(Color.BLACK);
                ruut.setFill(Color.BLUE);
                laud.add(ruut, i, j);
            }
        }
    }

    private void seadistaLava() {
        laud = new GridPane();
        maailm = new StackPane();
        maailm.getChildren().add(laud);

        Scene manguStseen = new Scene(maailm, stseeniPikkus, stseeniLaius);

        lava.setScene(manguStseen);
        lava.setTitle("Laevade pommitamine");
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));
    }
}
