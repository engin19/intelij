package class16;

public class AnimalTester {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Jacky";
        d.color="Black";
        d.age=10;
        d.weight=22;
        d.printInfo();
        d.bark();
        d.printInfo();
        
        Cat c=new Cat();
        c.name= "lola";
        c.color="White";
        c.age=8;
        c.weight=16;
        c.sleep();
        c.printInfo();
        
    }
}
