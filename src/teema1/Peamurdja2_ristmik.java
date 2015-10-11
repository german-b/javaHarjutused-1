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
        Foor foor1 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor2 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        int count = 0;

        while (count < 10) {
            tsykkel(foor1, 0);
            tsykkel(foor2, 0);
            tsykkel(foor3, 1);
            tsykkel(foor4, 1);
        count++;
        }
    }

    private void tsykkel(Foor foor, int suund) {
        if (suund != 0) {
            foor.vahetaPunast();
            foor.paus(2);
            foor.vahetaKollast();
            foor.paus(0.6);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.vahetaRohelist();
            foor.paus(3);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.vahetaKollast();
            foor.paus(0.8);
            foor.vahetaKollast();

        } else {
            foor.vahetaRohelist();
            foor.paus(3);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.vahetaKollast();
            foor.paus(0.8);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(2);
            foor.vahetaKollast();
            foor.paus(0.6);
            foor.vahetaPunast();
            foor.vahetaKollast();

        }
    }
}