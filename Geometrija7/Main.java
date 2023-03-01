package Geometrija7;

public class Main {

    public static void main(String[] args) {
        Square s =new Square("Kvadrat", "crna", 5) ;
        System.out.println(s.name +" cija je stranica dimenzije "+ s.x + " boja "+ s.color + " povrsina je "+ s.x*s.x);

        Circle k =new Circle("Krug", "bela", 6);
        Rectangle r =new Rectangle("Pravugaonik ", "crveni ", 11);

    }
}
