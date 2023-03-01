package Kalkulator;

public class Kalkulator {

    double operand1;
    double operand2;

    public Kalkulator(double operand1,double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void add(double operand1, double operand2){
        double result = operand1 + operand2;
        System.out.println(result);
    }
    public void sub(double operand1, double operand2){
        double result = operand1 - operand2;
        System.out.println(result);
    }
    public void mul(double operand1, double operand2){
        double result = operand1 * operand2;
        System.out.println(result);
    }
    public void div(double operand1, double operand2){
        double result = operand1 / operand2;
        System.out.println(result);
    }

}
