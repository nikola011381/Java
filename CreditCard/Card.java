package CreditCard;

public class Card {
    public double balance;

    public Card (double balance){
        this.balance = balance;
    }
    public void charge(double charge){
        if(this.balance>=charge){
            this.balance -= charge;
            System.out.println("successfully charged "+charge+" eur.");
        } else {
            System.out.println("Not enough money in the account, payment cancelled");
        }
    }
}
