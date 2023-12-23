package homework;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make,String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

        public void rentalPrice(int day,int dprice){
            int total=day*dprice;
            System.out.println("  Your "+make+ " "+model+" car rental for "+day+"is "+total);

        }
    }


