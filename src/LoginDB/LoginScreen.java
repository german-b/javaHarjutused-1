package LoginDB;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by gbreus on 22.11.15.
 */
public class LoginScreen {
    public LoginScreen(){
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        Label kasutajanimi = new Label("Kasutajanimi");

        vbox.getChildren().addAll(kasutajanimi);

        stage.setScene(scene);
        stage.show();
    }
}
