package teema1;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Random;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {

    public static void main(String[] args) {

 /*1-dimensiooniline laud

   int[] laud = new int[10];
    Random randomGenerator = new Random();

        for (int i = 0; i < 10; i++ ) {
            int randomInt = randomGenerator.nextInt(2);
            System.out.println(randomInt);

            laud[i] = randomInt;
        }

        Scanner sisend = new Scanner(System.in);
        System.out.println("Tulista:");
        int sisend1 = sisend.nextInt();

        if (laud[sisend1-1] == 1){
            System.out.println("Pihtas!");

        } else System.out.println("M88da!");
    TODO: lisada mitu käiku

*/

        //2-dimensiooniline laud (ruudustik)

        int[][] laud2 = new int[4][4];
        int n = 4; //algsete laevade arv
        int m = 4; //arvamata laevade arv

        Random randomGenerator = new Random();
        while (n > 0) {
            for (int i = 0; i < 4; i++) {
                for (int a = 0; a < 4; a++) {
                    int randomInt = randomGenerator.nextInt(2);
                    laud2[i][a] = randomInt;
                    if (randomInt == 1) {
                        n--;
                        break;
                    }
                }
            }
        }
        // Prindib tegeliku laua koos laevadega
        for (int i = 0; i < 4; i++) {

            for (int a = 0; a < 4; a++) {
                System.out.print(laud2[i][a]);
            }
            System.out.println();
        }
        while (m > 0) {
            Scanner sisend = new Scanner(System.in);
            System.out.println("Sisend:");
            String sisend2 = sisend.next();

            int i1 = Character.getNumericValue(sisend2.charAt(0)) - 1;
            int i2 = Character.getNumericValue(sisend2.charAt(1)) - 1;

            if (laud2[i1][i2] == 1) {
                laud2[i1][i2] = 2;
                m--;
                System.out.println("Pihtas!");

            } else if (laud2[i1][i2] == 0) {

                System.out.println("M88da!");
            } else {
                System.out.println("Lase surnutel rahus puhata.");
            }

            if (m == 0) {

                System.out.println("Mäng läbi, sinu võit!");

            }
        }
    }
}