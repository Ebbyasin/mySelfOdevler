package ssgOdevler;

public class Odev01 {

    public static void main(String[] args) {

        //Math classindan max methodunu kullanarak fori ile tek tek kontrol edip yapan islemi yapınız
    /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
     /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int [][] arr= {{1,2,3}, {4,5}, {6},{3,6,2}};
        int crpm=1;
        for (int [] w:arr) {
            crpm=crpm*w[w.length-1];
        }
        System.out.println(crpm);
    }
}
