package Product;

public class Product {
    public String name;
    public int id;
     public double price;
     public static double tax =20;
    public Product(String name, double price, int id, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.id = id;
    }




}
