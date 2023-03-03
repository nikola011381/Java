package Conditions;

import java.util.Scanner;

public class IfElse_PrimeNumber {
    public static void main(String[] args) {

   System.out.print("Unesite neki ceo broj da proverimo da li je prost broj ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int deljiv = -1;
    boolean prost = true;


if (n <= 1) {
        prost = false;
    } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prost = false;
                deljiv = i;
                break;
            }
        }
    }

if (prost) {
        System.out.println(n + " je prost broj.");
    } else {
        System.out.println(n + " nije prost broj, i prvi broj s kojim je deljiv je " + deljiv);
    }
}
}
