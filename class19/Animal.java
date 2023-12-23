package class19;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    public Animal(String name, String color, int age, double weight) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;

    }

    public void PrintInfo() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }
}
class Dog extends Animal {
    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void bark() {
        System.out.println("wouff");

    }

}
class Cat extends Animal {

    public Cat(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void meow() {
        System.out.println("Meow meow.....");
    }
}