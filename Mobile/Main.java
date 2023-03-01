package Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Fon prvi", "11T");
        Mobile mobile2 = new Mobile("Drugi prvi", "22T");

        System.out.println(mobile.brand +" " + mobile.model);

        System.out.println(mobile2.brand +" "+ mobile2.model);

    }
}
