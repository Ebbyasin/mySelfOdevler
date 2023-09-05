package odevler;

import java.util.ArrayList;
import java.util.Scanner;

public class BakkalSorusuDigerCozum {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        //1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        ArrayList <String> gunler = new ArrayList<>();

        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        ArrayList <Double> gunlukKazanclar = new ArrayList<>();

        //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner   input =new Scanner(System.in);
        int idx=0;
        while (idx<7){
            System.out.println("Lütfen günlük kazancı pazartesiden başlayarak giriniz.");
            gunlukKazanclar.add(input.nextDouble());
            idx++;
        }
        System.out.println((gunlukKazanclar));

        double ortalama = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println(ortalama);

        System.out.println("OrtalamaninUstundeKazancGünleri = " + getOrtalamaninUstundeKazancGünleri(gunlukKazanclar, ortalama, gunler));
        System.out.println("OrtalamaninAltındaeKazancGünleri = " + getOrtalamaninAltindaKazancGünleri(gunlukKazanclar, ortalama, gunler));

    }

    //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    public static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        if (gunlukKazanclar.isEmpty()) {
            return 0.0;
        }

        double toplam = 0.0;
        for (double w : gunlukKazanclar) {
            toplam += w;
        }
        return toplam / gunlukKazanclar.size();
    }

    //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    // ortalama kazançtan yüksekse o günleri return yap.

    public static ArrayList<String> getOrtalamaninUstundeKazancGünleri(ArrayList<Double> gunlukKazanclar, double ortalama, ArrayList<String> gunler) {
        ArrayList<String> ustOrtalamaKazancGunleri = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalama) {
                ustOrtalamaKazancGunleri.add(gunler.get(i));
            }
        }
        return ustOrtalamaKazancGunleri;
    }

    //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    // ortalama kazançtan aşağıysa o günleri return yap.

    public static ArrayList<String> getOrtalamaninAltindaKazancGünleri(ArrayList<Double> gunlukKazanclar, double ortalama, ArrayList<String> gunler) {
        ArrayList<String> altOrtalamaKazancGunleri = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalama) {
                altOrtalamaKazancGunleri.add(gunler.get(i));
            }
        }
        return altOrtalamaKazancGunleri;
    }
}
