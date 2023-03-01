package Product;

public class Wine  extends Product{

    public static double taxplus=10;
    public double bottlevolume;

    public Wine(String name, double price, int id, double tax, double taxplus, double bottlevolume)
    {
        super(name, price,id,  tax);
        this.bottlevolume=bottlevolume;
        this.taxplus=taxplus;
    }


}
