
import java.math.BigDecimal;

public class Main {
   public static void main(String[] args) {


//      public static void ukol1() {
            System.out.println("Hello world!");         // Hello world!: absence uvozovek a středníku na konci řádku
 //       }
//    public static void ukol2() {
        String uzivatel = "Karel";                   // Karel = text řetezec, nejsou uvozovky
        System.out.println(uzivatel);
//    }
//
//    public static void ukol3() {
        int pocetLekci = 10;                        //  jedná se o číslo bez desetinných míst, změna String na int
        System.out.println("cena je: "+pocetLekci);
//    }
//
//    public static void ukol4() {
        BigDecimal cena = BigDecimal.valueOf(10.0);  //  jedná se o cenu, změna double na BigDecimal,
        System.out.println(cena);                      //  dále oprava desetinné čárky na tečku
//    }
//
//    public static void ukol5() {
      BigDecimal cena1 = BigDecimal.valueOf(0); // Nastavíme do proměnné hodnotu 0
//        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena1 = cena1.add(BigDecimal.valueOf(0.1));
//               // operátor "+=" znamená: přičti ke stávající
//               // hodnotě navíc 0.1
        }
        System.out.println("úkol 5: "+cena1);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
//    }
//
//    public static void ukol6() {
        BigDecimal cena2 = BigDecimal.valueOf(0);
        cena2 = cena2.add(BigDecimal.valueOf(0.1));
        System.out.println(cena2);
//    }
//
//    public static void ukol7() {
        int vykonMotoru = 120;                           // jedná se o "int" , nedává se do uvozovek jako String
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
//    }
//
//    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ "."); //odkaz na proměnnou se neohraničuje čárkama
//    }
//
//    public void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
//    }

 //   public static void main(String[] args) {
 //       System.out.println("Oprav chyby a spusť všechny metody!");
 //       System.out.println("Komentáře odstraníš klávesovou "
 //               +"zkratkou <Ctrl>+</> - použij lomítko "
 //               +"na numerické klávesnici.");
//        ukol1();
//        ukol2();
//        ukol3();
//        ukol4();
//        ukol5();
//        ukol6();
//        ukol7();
//        ukol8();
//        ukol9();
    }
}