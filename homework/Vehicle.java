package homework;

public class Vehicle {

String model;
    public Vehicle() {
        System.out.println("I love vehicle");

    }

    public Vehicle(String model){
        System.out.println("I love "+model);

    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Vehicle v1=new Vehicle("R8");

    }

    }