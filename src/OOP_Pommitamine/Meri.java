package OOP_Pommitamine;

/**
 * Created by gbreus on 21.11.15.
 */
public class Meri {
    private int lauaServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus){
        //System.out.println("Constructor meri");
        lauaServaPikkus = pikkus;
        tekitaLaevastik();
    }

    private void tekitaLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(lauaServaPikkus);
        }
    }

    public boolean laevuOnAlles() {
        boolean elus = false;
        for (int i = 0; i < laevastik.length; i++) {
            elus = laevastik[i].oledElus();
        }
        return elus;
    }

    public boolean saiPihta(int[] lask) {
        for (Laev laev: laevastik){
            boolean pihtas = laev.kasTabas(lask);
            if (pihtas){
                return true;
            }
        }
        return false;
    }

    public void kuvaLaud() {
        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {
                boolean onLaev = kasLaevaOnSiin(i, j);
                if(onLaev) {
                    System.out.print("0");
                } else{
                    System.out.print("~");
                }

            }
            System.out.println();
        }
    }

    private boolean kasLaevaOnSiin(int i, int j) {
        for (Laev laev : laevastik) {
            if (laev.kasOledSiin(i, j)){
                return true;
            }

        }
        return false;
    }
}

