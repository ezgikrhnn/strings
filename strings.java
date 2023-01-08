//DERS80 STRİNG SINIFI METODLARI:
/*
**isim.lenght() --> kac karakter oldugunu dondurur
**isim.charAt(index)  --> index 0 için elemanın ne oldugunu dondurur.
**isim.concat() --> parametre olarak verilen ifade ile isim değişkenini birleştirir.
ve yeni bir string dondurur.
**isim.toUpperCase() --> tum karakterleri buyuk harfe donusturulmuş yeni bir string donfurur.
*isim.trim() --> iki taraftaki boşlukları siler ve yeni bir string dondurur.

bu gibi lenght() gibi nesne.length() diye cagırılan metotlara (nesneyle kullanılan) İNSTANCE METOT diyoruz.
 */

package bolum8;

public class strings {
    public static void main(String[] args) {

        String isim = "ezgi";

        System.out.println(isim.length());
        System.out.println(isim.charAt(2));
        System.out.println(isim.concat(" karahan")); // bu işlemden sonra isim stringi değişmemiştir. bakalım:
        System.out.println(isim); //ismin hala ezgi oldugunu gorduk
        System.out.println(isim.toUpperCase());


        String ay = "ocak";
        String ay2 = "ocak";
        String ay3 = "nisan";

        System.out.println(ay.equals(ay2));  //true

        String e = "hasan";
        String e1 = "hASaN";

        System.out.println(e.equalsIgnoreCase(e1));  //true

        System.out.println(ay.compareTo(ay3));  //ocak nisandan sonra gelir 1 dondurur.
        //compareTo eger iki deger birbirinin aynısıysa = 0;
        //eger 1. ikincisinden once geliyorsa -1
        //eger 1. nesne iceridekinden sonra geliyorsa da 1 dondurur.

        System.out.println(ay.startsWith("A"));   //false
        System.out.println(ay.endsWith("k"));     //true
        System.out.println(ay.contains("c"));     //true


        String manita = "hasan cetin";
        System.out.println(manita.substring(8));  //tin

        System.out.println(manita.trim().substring(0,5));  //hasan-->0dan basla 5inci indexe kadar

        System.out.println(manita.trim().indexOf("h"));   //h harfinin ilk gectiği yeri veriyor.
        System.out.println(manita.trim().indexOf("a"));   //a harfinin ilk gectiği yeri veriyor.
        System.out.println(manita.trim().lastIndexOf("a")); //a harfinin son gectiği indexi veriyor.

        //string degerleri birleştirirke sayıyla toplarsak sayi da string deger gibi davranır:
        System.out.println("ezgi" +7+ "karahan");  //ezgi7karahan cıktısını alırım

        //ifadelerden herhangi biri stringsse otomatik olarak digerleri int olsa bile stringe cevirir.

    }
}
