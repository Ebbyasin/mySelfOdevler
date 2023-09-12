package ssgOdevler;

public class Odev02 {

    public static void main(String[] args) {

         /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
        */
        int [][] arr={{3,5,8},{1,3,5},{2,4},{8},{4,1,4}};
        int top=0;
        int eSayisi=0;
        for (int [] w:arr) {
            eSayisi=eSayisi+w.length;
            for (int a:w) {
                top=top+a;
            }
        }
        int ort=top/eSayisi;
        for (int [] w:arr) {
            for (int a:w) {
                if (a>ort){
                    System.out.println(a);
                }else continue;
            }
        }
    }


}
