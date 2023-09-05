package odevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev001 {
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

        List<String> gunler=new ArrayList<>();
        gunler.add("pazartesi");
        gunler.add("salı");
        gunler.add("çarşamba");
        gunler.add("perşembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        System.out.println(gunler);

        Scanner input=new Scanner(System.in);
        List<Double> gunlukKazanclar=new ArrayList<>();




        int i=1;
        while (i<gunler.size()+1){
            System.out.println("lütfen "+i+". günkü kazancınızı söyleyiniz");
            gunlukKazanclar.add(input.nextDouble());
            i++;
        }
        System.out.println(gunlukKazanclar);

        double ort=getOrtalamaKazanc(gunlukKazanclar);
        System.out.println(ort);
        System.out.println("ortalamanın üstünde kazanc günleri : "+getOrtalamaninUstundeKazancGünleri(gunler, gunlukKazanclar, ort));
        System.out.println("ortalamanın altında kazanc günleri : "+getOrtalamaninAltındaKazancGünleri(gunler, gunlukKazanclar, ort));


    }

    public static double getOrtalamaKazanc(List<Double> a){
          Double toplam=0.0;
        for (Double w:a) {
            toplam+=w;
        }
        return toplam/a.size();

    }
    protected static List<String> getOrtalamaninUstundeKazancGünleri(List<String>x,List<Double>y,double z){
        List<String>ortUstuGunler=new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (y.get(i)>z){
                ortUstuGunler.add(x.get(i));
        }


        }

        return ortUstuGunler;
    }

    protected static List<String> getOrtalamaninAltındaKazancGünleri(List<String>x,List<Double>y,double z) {
        List<String> ortAltıGunler = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (y.get(i) < z) {
                ortAltıGunler.add(x.get(i));
            }


        }

        return ortAltıGunler;
    }
}

