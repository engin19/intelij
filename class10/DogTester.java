package class10;

public class DogTester {
    public static void main(String[] args) {
        //Creating an object of the class
Dog dog1=new Dog();
//data type is Dog.
        /*Dog is Data Type
        dog1= is a variable that holds the object
        new Dog()=Creating the object of Dog class
         */
        dog1.name="Cooper";
        dog1.breed="German";
        dog1.age=5;
        dog1.weight=15;
        dog1.color="Black";
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.breed);
        System.out.println(dog1.color);

        dog1.bark();
        dog1.bark();
        dog1.sleep();

        Dog dog2=new Dog();
        dog2.name="Leo";
        dog2.color="White";
        dog2.breed="bulldog";
        dog2.age=8;
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        System.out.println(dog2.breed);
        System.out.println(dog2.name);
        dog2.eat();
        dog2.sleep();

    }
}
