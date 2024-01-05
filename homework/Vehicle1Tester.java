package homework;

public class Vehicle1Tester {
    public static void main(String[] args) {
        Vehicle1 v1=new Car1("toyota","corolla",2.8);
        Vehicle1 m1=new Moto1("Honda","srx",21.5);
        Vehicle1 t1=new Truck1("Ford","F150",175);
        v1.startEngine(165);
        t1.startEngine(175);
        m1.startEngine(250);
        m1.fuelUp(0.5);
        v1.fuelUp(0.8);
        t1.fuelUp(0.4);
        v1.stopEngine();
        t1.stopEngine();
        m1.stopEngine();


    }
}