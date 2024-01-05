package homework;

 public abstract class Vehicle1 {
   private final String make,model;
    private double fuelLevel,temp;

    public abstract void startEngine(double temp);

    public abstract void stopEngine();


    public abstract void fuelUp(double fuelLevel);


    public Vehicle1(String make, String model, double fuelLevel){
        this.fuelLevel=fuelLevel;
        this.make=make;
        this.model=model;
    }
}
class Car1 extends Vehicle1{


Car1(String make,String model,double fuelLevel){
    super(make, model, fuelLevel);
}
@Override
    public void startEngine(double temp){
        System.out.println("Car engine starts with "+temp);
    }
    @Override
    public void stopEngine(){
        System.out.println("Car engine is stopped ");

    }
    @Override
    public void fuelUp(double fuelLevel){
        System.out.println("Car fuel level is "+fuelLevel);

    }
}
class Truck1 extends Vehicle1{
    public Truck1(String make, String model, double fuelLevel) {

        super(make, model, fuelLevel);
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck  engine is stopped ");
    }

    @Override
    public void startEngine(double temp){
        System.out.println("Truck engine starts with "+temp);
    }


    @Override
    public void fuelUp(double fuelLevel){
        System.out.println("The fuel level is  "+fuelLevel);
    }
}
class Moto1 extends Vehicle1{
    public Moto1(String make, String model, double fuelLevel) {
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine(double temp){
        System.out.println("Car engine starts with "+temp);
    }

    @Override
    public void stopEngine(){
        System.out.println("Moto engine is stopped ");
    }
    @Override
    public void fuelUp(double fuelLevel){
        System.out.println("The fuel level is  "+fuelLevel);
    }
}