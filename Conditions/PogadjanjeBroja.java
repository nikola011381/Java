package Conditions;
import java.util.Random;
import java.util.Scanner;
public class PogadjanjeBroja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Unos granice opsega
        System.out.print("Unesite gornju granicu opsega: ");
        int gornjaGranica = input.nextInt();

        // Generiranje slučajnog broja u opsegu [1, gornjaGranica]
        int tajniBroj = rand.nextInt(gornjaGranica) + 1;

        System.out.println("Pogodite tajni broj u opsegu od 1 do " + gornjaGranica);
        boolean pogodak = false;
        int brojPokusaja = 0;

        while (!pogodak) {
            System.out.print("Unesite broj ili odustajem: ");
            String unos = input.next();
            if (unos.equalsIgnoreCase("odustajem")) {
                System.out.println("Odustali ste. Tajni broj je bio " + tajniBroj);
                break;
            }
            int pokusaj = Integer.parseInt(unos);
            brojPokusaja++;

            if (pokusaj == tajniBroj) {
                pogodak = true;
                System.out.println("Bravo! Pogodili ste tajni broj " + tajniBroj + " u " + brojPokusaja + " pokušaja!");
            } else if (pokusaj < tajniBroj) {
                System.out.println("Pogrešan odgovor. Tajni broj je veći.");
            } else {
                System.out.println("Pogrešan odgovor. Tajni broj je manji.");
            }
        }

        input.close();
    }
}
