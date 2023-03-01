package Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Unesite naziv cokolade: ");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        System.out.print("Unesite ID cokolade: ");
        int id = scanner.nextInt();
        System.out.print("Unesite cenu cokolade: ");
        double price = scanner.nextDouble();


        Product chocolate= new Product(name, price, id,Product.tax);

        System.out.println("Naziv: " + chocolate.name);
        System.out.println("ID: " + chocolate.id);
        System.out.println("Cena: " + chocolate.price);
        System.out.println("Porez: " + chocolate.tax);
        System.out.println("Cena sa porezom je : " + (chocolate.price+ (chocolate.price* chocolate.tax/100)));


        System.out.print("Unesite naziv Vina: ");
        Scanner scanner2 = new Scanner(System.in);
        String wname =scanner2.next();
        System.out.print("Unesite ID vina: ");
        int wid = scanner2.nextInt();
        System.out.print("Unesite cenu vina: ");
        double wprice = scanner2.nextDouble();
        System.out.print("Unesite zapreminu  vina: ");
        double wbottlevolume = scanner2.nextDouble();

        Wine wine = new Wine(wname, wprice, wid, Product.tax,  Wine.taxplus,wbottlevolume );

        System.out.println("Naziv vina: " + wine.name);
        System.out.println("ID vina: " + wine.id);
        System.out.println("Cena vina: " + wine.price);
        System.out.println("Porez vina: " + wine.tax);
        System.out.println("Dodatni porez vina: " + wine.taxplus);
        System.out.println("Cena vina sa porezom je : " + (wine.price+ (wine.price* wine.tax/100)));
        double winetax=(wine.price+ (wine.price* wine.tax/100));
        System.out.println("Cena vina sa dodatnim porezom je : " + (winetax + (winetax* wine.taxplus/100)));
        System.out.println("Zapremina vina je : " + wbottlevolume);



    }
}
