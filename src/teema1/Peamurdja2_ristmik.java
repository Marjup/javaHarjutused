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

        int count = 0;
        
        while (count < 5){
            foor1.syytaPunane();
            foor1.paus(1);
            foor1.syytaKollane();
            foor1.paus(1);
            foor1.kustutaPunane();
            foor1.kustutaKollane();
            foor1.syytaRoheline();
            foor1.paus(1);
            foor1.kustutaRoheline();
            foor1.paus(0.2);
            foor1.syytaRoheline();
            foor1.paus(0.2);
            foor1.kustutaRoheline();
            foor1.paus(0.2);
            foor1.syytaRoheline();
            foor1.paus(0.2);
            foor1.kustutaRoheline();
            foor1.paus(0.2);
            foor1.syytaRoheline();
            foor1.paus(0.2);
            foor1.kustutaRoheline();
            foor1.syytaKollane();
            foor1.paus(1);
            foor1.kustutaKollane();
            foor1.paus(0.5);
            count = count + 1;
        }
    }
}
