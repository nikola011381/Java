package Conditions;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;


public class Loto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Unos broja kuglica koje se izvlače
        System.out.print("Koliko kuglica se izvlači? ");
        int izvlacenje = input.nextInt();

        // Unos broja kuglica u bubnju
        System.out.print("Koliko kuglica je u bubnju? ");
        int brojKuglica = input.nextInt();

        BigInteger faktorijelN = faktorijel(BigInteger.valueOf(brojKuglica));
        BigInteger faktorijelK = faktorijel(BigInteger.valueOf(izvlacenje));
        BigInteger faktorijelNMinusK = faktorijel(BigInteger.valueOf(brojKuglica - izvlacenje));

        BigInteger brojKombinacija = faktorijelN.divide(faktorijelK.multiply(faktorijelNMinusK));

        System.out.println(" ");
        System.out.println("Broj kombinacija u Loto igri je: " + brojKombinacija);
        System.out.println(" ");

        // Generiranje slučajnih brojeva
        System.out.print("Dobitni brojevi su: ");
        int[] izvuceniBrojevi = new int[izvlacenje];
        for (int i = 0; i < izvlacenje; i++) {
            int broj;
            do {
                broj = rand.nextInt(brojKuglica) + 1;
            } while (sadrzi(izvuceniBrojevi, broj));
            izvuceniBrojevi[i] = broj;
            System.out.print(broj + " ");
        }
        Arrays.sort(izvuceniBrojevi);
        System.out.println();
        System.out.print("Sortirani dobitni brojevi su: ");
        for (int broj : izvuceniBrojevi) {
            System.out.print(broj + " ");
        }
    }

    public static boolean sadrzi(int[] polje, int trazeniBroj) {
        for (int broj : polje) {
            if (broj == trazeniBroj) {
                return true;
            }
        }
        return false;
    }

    public static BigInteger faktorijel(BigInteger n) {
        BigInteger faktorijel = BigInteger.ONE;
        for (int i = 2; i <= n.intValue(); i++) {
            faktorijel = faktorijel.multiply(BigInteger.valueOf(i));
        }
        return faktorijel;
    }
}
