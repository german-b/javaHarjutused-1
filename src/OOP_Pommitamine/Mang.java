package OOP_Pommitamine;

/**
 * Created by gbreus on 21.11.15.
 */
public class Mang {
    public Mang() {

        //1. Mängu seadistada
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        //2. Mängu töös hoidmine
        while (meri.laevuOnAlles()){
            meri.kuvaLaud();
          int[] lask = mangija.kuhuLasta();
              boolean pihtas = meri.saiPihta(lask);
            if (pihtas){
                mangija.pihtas();
           } else {
                mangija.moodas();
            }

        }

      //3. Kui mäng läbi, mis saab?
        mangija.gameover();
    }
}
