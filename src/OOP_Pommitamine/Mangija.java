package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by gbreus on 21.11.15.
 */
public class Mangija {

    Scanner kasutajaSisestus = new Scanner(System.in);

    public int[] kuhuLasta() {
        System.out.println("Sisesta koordinaadid, kuhu kõmmutada formaadis xxx,yyy");
        String[] input = kasutajaSisestus.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        return new int[]{x,y};
    }

    public void pihtas() {
        System.out.println("Pimm-põmm Pihtas!");

    }

    public void moodas() {
        System.out.println("Läks mööda");
    }

    public void gameover() {
        System.out.println("Game over.");
    }
}
