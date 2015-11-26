package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {
/*  1. ülesanne
      for (int i = 10; i > 0; i++){
            System.out.println(i + " ");
        }*/
    /*2. ülesanne
      for (int i = 0; i < 11; i++){
          if (i % 2 == 1) {
              System.out.println(i);
          }
        }*/
    // 3. ülesanne
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++) {
                int n = i + a;
                    if (n >= 10) {
                        n = n - 10;
                    }
                    System.out.print(n + " ");
            }
            System.out.println();
            }

        }
}