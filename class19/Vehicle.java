package class19;

public class Vehicle {
 int speed;
 String color;
    String FuelType;
 public void accelerate(){
     System.out.println("Vehicle speeds up");
 }
 public void brake(){
     System.out.println("Vehicle stops");
 }
 public Vehicle(int speed,String color,String FuelType){
     this.speed=speed;
     this.color=color;
     this.FuelType=FuelType;
 }

    public void printInfo() {
        System.out.println("Speed is "+speed+" "+"color is "+color+" "+"Fuel type is"+FuelType);

    }


}
     class Car extends Vehicle{
    public Car( int speed,String color,String FuelType){
        super(speed,color,FuelType);

    }
         @Override
         public void accelerate(){
             System.out.println("Car speeds up fast");
         }
         @Override
         public void brake(){
             System.out.println("Car stops easier");
         }
    }

class Truck extends Vehicle{
    public Truck( int speed,String color,String FuelType){
        super(speed,color,FuelType);

    }
    public void loadCargo(){
        System.out.println("Loads cargo in truck");
    }
    @Override
    public void accelerate(){
        System.out.println("Truck speeds up slower");
    }
    @Override
    public void brake(){
        System.out.println("Truck stops harder");
    }
}

class Moto extends Vehicle{
    public Moto( int speed,String color,String FuelType){
        super(speed,color,FuelType);

    }
    @Override
    public void accelerate(){
        System.out.println(" Moto speeds up fastest");
    }
    @Override
    public void brake(){
        System.out.println("Moto  stops faster");
    }
}
class Bike extends Vehicle{
    public Bike( int speed,String color,String FuelType){
        super(speed,color,FuelType);

    }
    @Override
    public void accelerate(){
        System.out.println("Bike speeds up the slowest");
    }
    @Override
    public void brake(){
        System.out.println("Vehicle stops fastest");
    }
}