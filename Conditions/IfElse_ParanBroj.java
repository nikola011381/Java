package Conditions;

import java.util.Scanner;

public class IfElse_ParanBroj {
    public static void main(String[] args) {

        System.out.print("Unesite neki ceo broj da proverimo da li je paran");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("Broj je paran");
        }

        else   {
            System.out.println("Broj je neparan ");

        }

    }

}
