import java.util.Scanner;

public class Vezba2 {

    public static void main(String[] args) {
        int operand1=2;
        int operand2=3;
        int sum=operand1 + operand2;
        System.out.println(sum);


        System.out.println("Unesi svoje ime:");

        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        System.out.println("Dobrodosao " + ime  );

    }


}
