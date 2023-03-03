package CreditCard;

public class Main {
    public static void main(String[] args) {
        Card c = new Card(1000);
        naplati(c,500);
        naplati(c,500);
        naplati(c,100);

    }
    public static void naplati(Card c,double iznos){
        c.charge(iznos);
    }
}

