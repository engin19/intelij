package homework;

public class Computer {
    private String make,model;
    private int ram;
    private double price;
    String name=make;

    public Computer(String make, String model, int ram, double price) {
        this.make = make;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    void turnOn(){
        System.out.println("Computers turn on");
    }
    void turnOff(){
        System.out.println("Computers turn off");

    }
    void printInfo(){
        System.out.println(make+" "+model+" "+ram+" $ "+price);
    }
}
class Apple extends Computer{
    public Apple(String make, String model, int ram, double price) {
        super(make, model, ram, price);
    }
    @Override
    void turnOn(){
        System.out.println("Computers turn on");
    }
    void turnOff(){
        System.out.println(name+"Computers turn off");

    }
}
class Lenovo extends Computer{
    public Lenovo(String make, String model, int ram, double price) {
        super(make, model, ram, price);
    }
    void turnOn(){
        System.out.println(name+"Computers turn on");
    }
    void turnOff(){
        System.out.println(name+"Computers turn off");

    }
}
class HP extends Computer{
    public HP(String make, String model, int ram, double price) {
        super(make, model, ram, price);
    }
    void turnOn(){
        System.out.println(name+"Computers turn on");
    }
    void turnOff(){
        System.out.println(name+"Computers turn off");

    }
}
class Dell extends Computer {
    public Dell(String make, String model, int ram, double price) {
        super(make, model, ram, price);
    }

    void turnOn() {
        System.out.println( name+ "Computers turn on");
    }

    void turnOff() {
        System.out.println(name + "Computers turn off");

    }
}
class ComputerTester{
    public static void main(String[] args) {
        Computer [] arr={new Apple("Apple","RC20876",16,1250),
                        new Lenovo("Lenovo","Len0810",8,1099),
                        new HP("HP","Hp76564",32,1299),
                new Dell("Dell","D09876",16,699)
        };
        for (int i = 0; i < arr.length ; i++) {
            arr[i].printInfo();

            arr[i].turnOff();
            arr[i].turnOff();
            System.out.println("-----------------------0--------------------------------------");
        }
    }
}