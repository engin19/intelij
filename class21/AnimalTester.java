package class21;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.sleep();
        c.speak();
        System.out.println("_____________________________");
        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.speak();
        System.out.println("_____________________________");
        Animal c2=new Cat();
        c2.speak();
        c2.sleep();
        c2.eat();
        System.out.println("_____________________________");
    Animal[] arr={new Cat(),new Dog()};
    for(Animal a:arr){
        a.eat();
        a.sleep();
        a.speak();
    }
    }

}
