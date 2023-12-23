package replit;

class Main {
    String breed;
    String name;
    String color;
    void bark(){
        System.out.println(breed +" " +"can bark");

    }
    void run(){
        System.out.println(breed +" " + "can run");
    }
    void play(){
        System.out.println(breed + " " +"can play");
    }
    public static void main(String[] args) {

        Main husky=new Main();
        husky.breed="Husky";
        husky.bark();
        husky.run();
        husky.play();

        Main bulldog=new Main();
        bulldog.breed="Bulldog";
        bulldog.bark();
        bulldog.run();
        bulldog.play();

        Main labrador =new Main();
        labrador.breed="Labrador";
        labrador.bark();
        labrador.run();
        labrador.play();


    }
}
