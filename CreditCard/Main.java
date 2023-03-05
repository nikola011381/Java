package CreditCard;

public class Main {
    public static void main(String[] args) {
        Card c = new Card(1000);
        charge(c,500);
        charge(c,300);
        charge(c,600);

    }
    public static void charge(Card c,double value){
        c.charge(value);
    }
}

