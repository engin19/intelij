package class10;

public class CarTester {
    public static void main(String[] args) {
        //Create an object from the class.
        Car bmw=new Car();
        bmw.color="Silver";
        bmw.make="BMW";
        bmw.model="I7";
        bmw.price=120.000;
        bmw.drive();
        bmw.ApplyBrake();
        bmw.honk();
        System.out.println(bmw.color);
        System.out.println(bmw.price);
        System.out.println(bmw.make);
        System.out.println(bmw.model);





    }
}
