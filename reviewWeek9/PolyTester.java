package reviewWeek9;

public class PolyTester {
    public static void main(String[] args) {
        Dog d=new Dog("Jacky","Black",5,"German");
        Cat c=new Cat("Mano","White",3);
        Animal[] animal={d,c};
        for (Animal a:animal){
            a.eat();
            a.getname();
            a.speak();
            a.printInfo();
            System.out.println(a.getname());
            if(a instanceof Dog){
                Dog d2=(Dog)a;
                d2.run();
            }

        }

//Animal[]arr={new Dog, new Cat}
    }
}
