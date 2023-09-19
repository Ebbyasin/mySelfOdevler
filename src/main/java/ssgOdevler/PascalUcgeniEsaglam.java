package ssgOdevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalUcgeniEsaglam {


    // Pascal Ucgeni Olusturalim...
    //    1
    //   1 1
    //  1 2 1
    // 1 3 3 1

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac satirlik pascal ucgeni olusturmak istersiniz...");
        int satir = inp.nextInt();
        pascalAl(satir);


    }

    private static void pascalAl(int n) {

        List<Integer> dizi = new ArrayList<>();
        List<Integer> dizi2 = new ArrayList<>();
        List<Integer> dizi3 = new ArrayList<>();
        int c = 0;

        dizi.add(1);
        dizi3.add(9);
        dizi3.add(9);
        System.out.println(dizi);


        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= n - i; k++) {  //j>> 0-4

                // for left spacing
                System.out.print(" ");
            }
            System.out.println(dizi.toString());
            int k = dizi.size() + 1;
            dizi2 = dizi;
            dizi2.add(0, 0);
            dizi2.add(0);

            for (int j = 0; j < k; j++) {
                c = dizi2.get(j) + dizi2.get(j + 1);
                dizi3.set(j, c);

            }
            dizi = dizi3;
            dizi3 = dizi2;


        }

    }
}
