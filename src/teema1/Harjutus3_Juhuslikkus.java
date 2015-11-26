package teema1;

import java.util.Random;
import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {

        kullJaKiri(); //1. ülesanne
        //tombaLiisk(); //2. ülesanne
        //t2ringuM2ng(); //3. ülesanne
    }

    public static void kullJaKiri(){
        boolean uuesti = true;
        Random r = new Random();

        while (uuesti) {
           Scanner sisend = new Scanner(System.in);
           int i = r.nextInt(2);
           System.out.println("Kas kull (1) või kiri (0)?");
           int arvamine = sisend.nextInt();
           if (arvamine == i) {
               System.out.println("Õige!");
           } else {
               System.out.println("Vale!");
           }
            System.out.println("Kas arvad uuesti? (jah/ei)");
            String vastus = sisend.next();
            if (vastus.equals("ei")){
                uuesti = false;
            }
       }
    }

    public static void tombaLiisk(){
        Scanner sisend = new Scanner(System.in);
        System.out.println("Inimeste arv, täisarv:");
        int arv = sisend.nextInt();
        Random r = new Random();
        int liisk = r.nextInt(arv) + 1; //genereerib 0...arv ja lisab 1, muidu on võimalik vastus 0
        System.out.println("Palun väga: " + liisk);
    }

    public static void t2ringuM2ng(){
        boolean uuesti = true;
        Random r = new Random();
        int at1 = r.nextInt(6) + 1; //genereerib esimese täringu arvutile, 1-6 silma
        int at2 = r.nextInt(6) + 1; //genereerib teise täringu arvutile, 1-6 silma
        int kt1 = r.nextInt(6) + 1; //genereerib esimese täringu kasutajale, 1-6 silma
        int kt2 = r.nextInt(6) + 1; //genereerib teise täringu kasutajale, 1-6 silma
        while (uuesti) {
            Scanner sisend = new Scanner(System.in);
            System.out.println("Viskan täringud endale: " + at1 + " ja " + at2);
            System.out.println("Kokku sain endale: " + (at1 + at2));
            System.out.println();
            System.out.println("Viskan täringud sulle: " + kt1 + " ja " + kt2);
            System.out.println("Kokku said: " + (kt1 + kt2));
            System.out.println();
            if ((kt1 + kt2) > (at1 + at2)) {
                System.out.println("Õnnitlused, sinu võit!");
            } else if ((kt1 + kt2) == (at1 + at2)) {
                System.out.println("Ossa, saime ühepalju!");
            } else {
                System.out.println("Jee, mina võitsin!");
                System.out.println();
            }
            System.out.println("Proovime veel? (jah/ei)");
            String vastus = sisend.next();
            if (vastus.equals("ei")){
                uuesti = false;
            }
        }
    }
}
