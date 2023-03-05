import java.util.Scanner;

public class Vezba2 {

    public static void main(String[] args) {
        int operand1=5;
        int operand2=6;
        int sum= operand1+operand2;

        System.out.println(operand1 + " + " + operand2 + " = " + sum  );


        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome " + name  );

    }
}
