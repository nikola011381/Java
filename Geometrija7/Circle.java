package Geometrija7;

import java.net.SocketOption;

public class Circle extends Shape{
     double PI=3.14;


    public Circle(String name, String color, int x) {
        super(name, color, x);
        double  r = x*x*PI;
        System.out.println(name +" ciji je radijus " + x +" boja "  +   color   + " povrsina je " + r);
        }

}
