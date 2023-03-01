package Geometrija;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        c.r = 2;

        r.a = 2;
        r.b = 3;

        s.a = 4;

        c.area();
        r.area();
        s.area();
    }
}
