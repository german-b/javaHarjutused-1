package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {

/*  1. ülesanne

    Scanner sisend = new Scanner(System.in);
        try {
            System.out.println("Sisesta täisarv:");
            int arv = sisend.nextInt();
            System.out.println( tostaKuupi(arv));
        } catch (InputMismatchException exception){
            System.out.println("Palun sisesta täisarv ilma muude sümboliteta!");
        }*/

        kasutajaSisestus("Sisesta täisarv:", 1, 99);

    }

    public static int tostaKuupi(int arv) {

        return (int) Math.pow(arv, 2);

    }

    public static void kasutajaSisestus(String kysimus, int min, int max) {

        boolean oigevastus = false;
        while (!oigevastus) {
            Scanner sisend = new Scanner(System.in);

            System.out.println(kysimus);
            int arv = sisend.nextInt();
            if (arv <= min) {
                System.out.println("Pakutud arv on liiga väike");
            } else {
                if (arv >= max) {
                    System.out.println("Pakutud arv on liiga suur");
                } else {
                    System.out.println("Piisavalt täpne!");
                    oigevastus = true;
                }
            }
        }
    }
}
