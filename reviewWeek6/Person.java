package reviewWeek6;

public class Person {

    String name;
    int age;
    double weight;
    double height;

void eat(){
    System.out.println("Eating.....");
}
   String getName(){
    return name;
   }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Karimi Naughty";
        p.age=22;
        p.height=5.4;
        p.height=120;
        System.out.println(p.name);
        System.out.println(p.age);
        p.eat();
        String name=p.getName();
        System.out.println(name);
    }
}
