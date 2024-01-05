package reviewWeek9;

public abstract class Animal {
private String name,color;
private int age;
// constructor is a block of code  which helps us initialize  the instance field of the class .
 public Animal(String name,String color,int age){
     this.name=name;
     this.color=color;
     this.age=age;

 }
 //methods are actions classes  can do
    public String getname(){
     return this.name;
    }
 public abstract void  eat();

 public abstract void speak();
 public void printInfo(){
     System.out.print(name+" "+color+" "+age+" ");
 }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, String color, int age,String breed) {
        super(name, color, age);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat Bones and Meat");
    }

    @Override
    public void speak() {
        System.out.println("Wauff Wauff ");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(breed);
    }
    void run(){
        System.out.println("Dog running");
    }
}

class Cat extends Animal{


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat Fish");
    }

    @Override
    public void speak() {
        System.out.println("Meauw  meaw meaow ");
    }

}

