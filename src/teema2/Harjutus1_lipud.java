package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Rectangle blue = new Rectangle(330, 70, Paint.valueOf("#3366FF"));
        Rectangle black = new Rectangle(330, 70, Paint.valueOf("#332B03"));
        Rectangle white = new Rectangle(330, 70, Paint.valueOf("#FFFFFF"));

        VBox lipp = new VBox();
        lipp.getChildren().addAll(blue, black, white);
        Scene scene = new Scene(lipp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
