package class16;

public class X {
    String name;
}
class Y extends X{

}
class Z extends Y{

}
class ZTester {


    public static void main(String[] args) {
        Z z=new Z();
            z.name="Engin";
        System.out.println(z.name);


    }
}