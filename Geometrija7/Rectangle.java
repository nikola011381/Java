package Geometrija7;

public class Rectangle extends Shape{
  static int y=12;

    public Rectangle(String name, String color, int x ) {
        super(name, color, x);
        System.out.println(name + " " + color + "x= " +x +" y= " + y + " povrsina je " + x*y);
    }



}
