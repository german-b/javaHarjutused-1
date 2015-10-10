package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor2 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        int count = 0;
        while (count < 5) {
            foor1.vahetaPunast();
            foor1.paus(2);
            foor1.vahetaKollast();
            foor1.paus(0.6);
            foor1.vahetaPunast();
            foor1.vahetaKollast();
            foor1.vahetaRohelist();
            foor1.paus(3);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.paus(0.5);
            foor1.vahetaRohelist();
            foor1.vahetaKollast();
            foor1.paus(0.8);
            foor1.vahetaKollast();
            count++;
        }
        int count2 = 0;
        while (count2 < 5) {
            foor2.vahetaPunast();
            foor2.paus(2);
            foor2.vahetaKollast();
            foor2.paus(0.6);
            foor2.vahetaPunast();
            foor2.vahetaKollast();
            foor2.vahetaRohelist();
            foor2.paus(3);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.paus(0.5);
            foor2.vahetaRohelist();
            foor2.vahetaKollast();
            foor2.paus(0.8);
            foor2.vahetaKollast();
            count2++;
        }
        int count3 = 0;
        while (count3 < 5) {
            foor3.vahetaRohelist();
            foor3.paus(3);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.paus(0.5);
            foor3.vahetaRohelist();
            foor3.vahetaKollast();
            foor3.paus(0.8);
            foor3.vahetaKollast();
            foor3.vahetaPunast();
            foor3.paus(2);
            foor3.vahetaKollast();
            foor3.paus(0.6);
            foor3.vahetaPunast();
            foor3.vahetaKollast();
            count3++;
        }
        int count4 = 0;
        while (count4 < 5) {
            foor4.vahetaRohelist();
            foor4.paus(3);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.paus(0.5);
            foor4.vahetaRohelist();
            foor4.vahetaKollast();
            foor4.paus(0.8);
            foor4.vahetaKollast();
            foor4.vahetaPunast();
            foor4.paus(2);
            foor4.vahetaKollast();
            foor4.paus(0.6);
            foor4.vahetaPunast();
            foor4.vahetaKollast();
            count4++;
        }
    }
}
