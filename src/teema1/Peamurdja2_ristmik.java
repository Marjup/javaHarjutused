package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.VASAK, primaryStage);
        Foor foor2 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.ALUMINE, primaryStage);

        for (int i = 0; i < 5; i++) {
            Ristmik2(foor1, 4, 11);
            Ristmik2(foor2, 15, 4);
            Ristmik2(foor3, 4, 11);
            Ristmik2(foor4, 15, 4);
        }

    }

    public void Ristmik2(Foor foorike, int ristmik1, int ristmik2) {
            foorike.syytaPunane();
            foorike.paus(ristmik1);
            foorike.syytaKollane();
            foorike.paus(1);
            foorike.kustutaPunane();
            foorike.kustutaKollane();
            foorike.syytaRoheline();
            foorike.paus(4);
            foorike.kustutaRoheline();
            foorike.paus(0.5);
            foorike.syytaRoheline();
            foorike.paus(0.5);
            foorike.kustutaRoheline();
            foorike.paus(0.5);
            foorike.syytaRoheline();
            foorike.paus(0.5);
            foorike.kustutaRoheline();
            foorike.paus(0.5);
            foorike.syytaRoheline();
            foorike.paus(0.5);
            foorike.kustutaRoheline();
            foorike.paus(0.6);
            foorike.syytaKollane();
            foorike.paus(0.6);
            foorike.kustutaKollane();
            foorike.paus(0.5);
            foorike.syytaPunane();
            foorike.paus(ristmik2);

    }
}