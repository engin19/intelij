package Practice;
 class Car{
    String carColor;
    int carYear;
    String carMake;

}
public class E3ClassObjects {
    public static void main(String[] args) {

            Car BMW = new Car();
            BMW.carColor = "Black";
            BMW.carYear = 2019;
            BMW.carMake = "BMW";
            System.out.println("Car color is " + BMW.carColor + " car year is " + BMW.carYear + " and car model is " + BMW.carMake);
            Car Toyota = new Car();
            Toyota.carColor = "White";
            Toyota.carYear = 2018;
            Toyota.carMake = "Toyota";
            System.out.println("Car color is " + Toyota.carColor + " car year is " + Toyota.carYear + " and car model is " + Toyota.carMake);


        }
    }
