package teema2;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();

        Label l = new Label("Kasutajanimi");
        TextField kasutajaInput = new TextField();
        kasutajaInput.setPromptText("kasutajanimi");

        Label l2 = new Label("Parool");
        PasswordField parool = new PasswordField();
        parool.setPromptText("parool");

        Button nupp = new Button("Logi sisse");
        nupp.setOnAction(event -> {
                    System.out.println("Logisid sisse");
                }
        );

        vbox.getChildren().addAll(l, kasutajaInput, l2, parool, nupp);

        Scene stseen = new Scene(vbox);
        primaryStage.setScene(stseen);
        primaryStage.show();
    }
}
