import java.util.Scanner;

public class Main {

    public static void compareStrings(String str1, String str2) {
        if (str1 == str2) {
            System.out.println("The strings are identical using '==' operator");
        } else {
            System.out.println("The strings are not identical using '==' operator");
        }

        if (str1.equals(str2)) {
            System.out.println("The strings are identical using 'equals()' method");
        } else {
            System.out.println("The strings are not identical using 'equals()' method");
        }
    }

    public static void main(String[] args) {
        long x;
        x = 2;
        String y = "Hallo";
        int z = 2;
        z = -1;
        z--;
        System.out.println(z);

        z = 0;
        System.out.println(z);

        if (z == 3) {
            System.out.println("z = " + z);
        } else if (z == 2) {
            System.out.println("z ist 2");
        } else {
            System.out.println("z ist nicht 3");
        }

        System.out.println("text1" + z + "text2");


        String m = "Hallo";
        String n = "Hallo2";
        
        var a = "a";
        var b = "A";
        var c = a.equalsIgnoreCase(b);
        var d = a.equals(b);
        System.out.println(c);  
        
        var scanner = new Scanner(System.in);
        
        var input = scanner.nextLine();
        




        /*
         *
         * ARETHMETISCHE (MENGEN) OPERATIONEN +, -, *, /, %, //, ** 
         *
         * int x = 0;
         * int y = 3;
         * int z = x++;
         * z += x;
         * boolean a = true;
         * boolean b = false;
         * a && (and) b -> false
         * a || (or) b -> true
         * !a (not) -> false
         * a == a (gleich) -> true
         *
         *
         *
         * */

        /*
         *
         *
         * == & equals -> Vergleichsoperatoren
         * == -> Vergleicht die Speicheradressen
         * equals -> Vergleicht den Inhalt
         *
         * String x = "Hallo";
         * String y = "Hallo";
         * String z = x;
         * x == y -> false
         * x == z -> true
         * x.equals(y) -> true
         *
         *
         * */

        /*
         *
         * Primitiven Datentypen:
         * - int
         * - double
         * - boolean
         * - float
         * - char
         * - long
         * - short
         * - byte
         *
         * */


        /*
         * Datentypen Java:
         * int - Ganzzahl -> 2^31 - 1 (2.147.483.647)
         * double - Kommazahl -> 10*-2^64 - 1 0.000...01
         * String - Zeichenkette (Buchstaben, Zahlen, Sonderzeichen)
         * boolean - Wahrheitswert (true/false) //nicht existente wert (null)
         * float - Kommazahl -> 10*-2^32 - 1 0.000...01
         * char - Zeichen (Buchstaben, Zahlen, Sonderzeichen)
         * long - Ganzzahl -> 2^63 - 1 (9.223.372.036.854.775.807)
         * short - Kommazahl -> 10*-2^15 - 1 0.000...01
         * byte - Kommazahl -> 10*-2^7 - 1 0.000...01
         * */
    }
}
