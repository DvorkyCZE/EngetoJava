import java.math.BigDecimal;

public class Main {
    // Zkouska commitu pres IntelliJ
    // přidány uvozovky
    public static void ukol1() {
        System.out.println("Hello world!");
    }
    // opět přidány uvozovky
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }
    // změna datového typu z objektového "string" na primitivní "int"
    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }
    // desetinné hodnoty se píší z tečkou
    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }
    // datový typ "double" nahrazen metodou BigDecimal
    public static void ukol5() {
        BigDecimal cena = BigDecimal.ZERO;
        BigDecimal increment = BigDecimal.valueOf(0.1);
        for (int i = 0; i < 10; i++) {
            cena = cena.add(increment);
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }
    // změna hodnoty 0 na BigDecimal.Zero
    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }
    // odtsraněny uvozovky z přiřazené hodnoty deklarované proměnné integer
    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: " +vykonMotoru+ " kW.");
    }
    // čárky nahrazeny znaménkem plus
    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ ".");
    }
    // změna z metody instance, která se vztahuje k objektu, na metodu statickou, která přísluší celé třídě.
    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }


    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}