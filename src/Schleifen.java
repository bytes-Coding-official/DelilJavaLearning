import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Schleifen {



    /*
     *
     * for (iterative zähl schleife)
     *
     * for each (iterative element schleife)
     *
     * while (bedingungsschleife)
     *
     * do while (bedingungsschleife)
     *
     * */

    public static void main1(String[] args) {

        // for (iterative zähl schleife)

        for (int zahl = 0; zahl < 100; zahl++) {
            System.out.println("zahl = " + zahl);
        }

        for (int i = 100; i > 0; i--) {
            System.out.println("i = " + i);
        }


        var liste = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        // for each (iterative element schleife)
        for (String element : liste) {
            System.out.println("element = " + element);
        }


        //  * while (bedingungsschleife)

        int zahl = 0;

        while (zahl < 100) {
            System.out.println("zahl2 = " + zahl);
            zahl++;
        }

        var scanner = new Scanner(System.in);
        String input;


        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            System.out.println("input = " + input);
        }


        //do while (bedingungsschleife)

        do {
            System.out.println("input2 = " + input);

        } while (!(input = scanner.nextLine()).equalsIgnoreCase("exit"));


        /*
        * Phasensprunganweisungen:
        * 
        * - break -> springt aus der schleife
        * - continue -> springt zum nächsten durchlauf
        * 
        * */


        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                continue;
            }
            
            if (i == 7) {
                break;
            }
            
            if(i == 8)
                return;
            
            System.out.println("i = " + i);
            
        }


        System.out.println("test");
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;
        int health = 100;  // Spieler-Gesundheit

        System.out.println("Willkommen beim Textadventure!");

        while(running) {
            System.out.println("Du begegnest einem wilden Monster! Willst du kämpfen oder fliehen?");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("kämpfen")) {
                int damage = (int) (Math.random() * 10 + 1);  // Zufälliger Schaden zwischen 1 und 10
                health -= damage;
                System.out.println("Du hast " + damage + " Schaden erlitten. Deine Gesundheit ist jetzt " + health + ".");
                if(health <= 0) {
                    System.out.println("Du bist gestorben. Spiel vorbei!");
                    running = false;
                }
            } else if(input.equalsIgnoreCase("fliehen")) {
                int heal = (int) (Math.random() * 10 + 1);
                if (health + heal > 100) {
                   health = 100;
                }else 
                    health += heal;
                System.out.println("Du rennst weg und findest einen sicheren Ort, um dich auszuruhen. Deine Gesundheit ist jetzt " + health + ".");
            } else {
                System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
            }
        }

        scanner.close();
    }
    }
