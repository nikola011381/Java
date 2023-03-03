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

   public void  printdata()
   {

       System.out.println("Cena vina sa porezom je : " + (price+ (price* tax/100)));
       double winetax=(price+ (price* tax/100));
       System.out.println("Cena vina sa dodatnim porezom je : " + (winetax + (winetax*  taxplus/100)));
       System.out.println("Zapremina vina je : " + bottlevolume);

   }

}
