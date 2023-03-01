package Product;

public class Chocolate extends Product{

    public double weight;
    public Chocolate(String name, double price, int id ,double tax, double weight) {
        super(name, price, id, tax);
        this.weight=weight;
    }


}
