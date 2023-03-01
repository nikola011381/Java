package Kalkulator;

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator(10,5);

        k.add(k.operand1,k.operand2);
        k.div(k.operand1,k.operand2);
        k.mul(k.operand1,k.operand2);
        k.sub(k.operand1,k.operand2);
    }
}
