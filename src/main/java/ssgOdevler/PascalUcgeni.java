package ssgOdevler;

import java.util.Scanner;

public class PascalUcgeni {
    // Pascal Ucgeni Olusturalim...
    //    1
    //   1 1
    //  1 2 1
    // 1 3 3 1

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac satirlik pascal ucgeni olusturmak istersiniz...");
        int satir = inp.nextInt();

        for (int i = 0; i < satir; i++) {
            for (int k = 0; k <=  i; k++) {  //j>> 0-4
                System.out.print("* ");
            }
            // for left spacing
            System.out.println();

        }
    }
}
