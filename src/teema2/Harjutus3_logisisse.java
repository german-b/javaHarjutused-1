package teema2;

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
public class Harjutus3_logisisse extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox elements = new VBox();
        Scene loginpage = new Scene(elements, 350, 350);
        primaryStage.setScene(loginpage);
        primaryStage.setTitle("Access dialogue");
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        Label userLabel = new Label ("Username");
        TextField userInput = new TextField();
        Label passwordLabel = new Label ("Password");
        PasswordField passwordInput = new PasswordField();
        Button login = new Button("Log in");
        Label message = new Label();
        elements.getChildren().addAll(userLabel, userInput, passwordLabel, passwordInput, login, message);

        StackPane loginSuccess = new StackPane();
        Label loggedInMessage = new Label("Logged in!");
        loginSuccess.getChildren().addAll(loggedInMessage);
        Scene loggedIn = new Scene(loginSuccess, 350, 350);

        login.setOnAction(event ->{
            String username = userInput.getText();
            String password = passwordInput.getText();
            if (username.equals("german") && password.equals("puuks")){
                primaryStage.setScene(loggedIn);
            } else {
                message.setText("Access denied.");
                userInput.setText("");
                passwordInput.setText("");

            }

        });


    }
}