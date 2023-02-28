public class TestPerson {

    public static void main(String[] args) {
        Person p1 =new Person();
        p1.firstName ="Nikola";
        p1.lastName ="Radovic";
        p1.age=33;
        p1.height=183;
        p1.weight=95.3;

        Person p2 =new Person();
        p2.firstName ="Marko";
        p2.lastName ="Savic";
        p2.age=24;
        p2.height=196;
        p2.weight=110.50;

        System.out.println("Osoba jedan je "+ p1.firstName +" "+ p1.lastName + " ima godina "+ p1.age + " visoka je "+ p1.height +" cm " + "teska je " + p1.weight + "kg");
        System.out.println("Osoba dva je "+ p2.firstName +" "+ p2.lastName + " ima godina "+ p2.age + " visoka je "+ p2.height +" cm " + "teska je " + p2.weight + "kg");

    }
}
