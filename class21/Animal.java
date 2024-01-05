package class21;

public abstract class Animal {
    private String name;
    private String color;

    public abstract void eat();
    public abstract void sleep();
public abstract void speak();

}
class Dog extends Animal{
@Override
    public void eat(){
        System.out.println("Dogs like to eat meat ");
    }
public void speak(){
    System.out.println("Wouff Wouff ");
}
public void sleep(){
    System.out.println("Dog sleep");
}
}
class Cat extends Animal{
   public  void eat(){
       System.out.println("Cats like to eat fish");
    }
    public void speak(){
        System.out.println("meoww ");
    }
    public void sleep(){
        System.out.println("Cat sleep");
    }

}