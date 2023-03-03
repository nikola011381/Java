package Conditions;
import java.util.Scanner;

public class Tablica_mnozenja {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Unesite broj redova (x): ");
            int x = input.nextInt();

            System.out.print("Unesite broj kolona (y): ");
            int y = input.nextInt();

            int[][] matrica = new int[x][y];

            // Kreiranje tablice množenja
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    matrica[i][j] = (i+1) * (j+1);
                }
            }

            // Ispis matrice
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(matrica[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }







