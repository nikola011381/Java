package Conditions;

import java.util.Scanner;

public class Sort_while_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        System.out.println("Originalni niz:");
        for (int i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();

        boolean zamenjeno = true;
        while (zamenjeno) {
            zamenjeno = false;
            for (int i = 0; i < n-1; i++) {
                if (niz[i] > niz[i+1]) {
                    int temp = niz[i];
                    niz[i] = niz[i+1];
                    niz[i+1] = temp;
                    zamenjeno = true;
                }
            }
        }

        System.out.println("Sortirani niz:");
        for (int i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }

    }
}
