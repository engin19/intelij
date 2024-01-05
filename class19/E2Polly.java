package class19;

public class E2Polly {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky", "Brown", 10, 25);
        Dog d2 = new Dog("Macky", "black", 10, 25);
        Cat c1 = new Cat("lovly", "black", 10, 25);
        Animal a1 = new Animal("Animal", "black", 10, 25);

        Animal[] arr = {d1, d2, c1, a1};

        Animal a2 = arr[0];
        a2.printInfo();
        //typecasting down-casting. since it is stored inside an
        //animal dataType so it is now an animal so if we want to call
        // it back as a cat we need to typecast.
        Cat c2 = (Cat) c1;
        c2.meow();
    }

}