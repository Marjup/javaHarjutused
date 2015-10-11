package teema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        ArrayList laevad = new ArrayList();

        for (int j = 0; j < 10; j++) {
            laevad.add((int) (Math.random() * 2));
        }

        Boolean saipihta = Boolean.TRUE;

        while (saipihta) {
            int koht = kysimus();
            Object väärtus = laevad.get(koht - 1);

            if (väärtus.equals(1)) {
                System.out.println("Vaenlase laev sai pihta! Elagu piraadid!");
                System.out.println(laevad);
                break;
            } else {
                System.out.println("Proovi uuesti!");
            }
        }

    }

    public static int kysimus (){
        Scanner kuslaev = new Scanner(System.in);
        System.out.println("Mitmendal kohal asub vaenlase laev?");
        int koht = kuslaev.nextInt();
        return koht;
    }
}
