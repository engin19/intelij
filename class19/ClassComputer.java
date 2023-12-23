package class19;

public class ClassComputer {
    public void turnOn(){
        System.out.println("Computer turns on ");
    }
public void type(){
    System.out.println("You can type");
}
}
 class Apple extends ClassComputer{
     public void play() {
         System.out.println("Apple play music ");
     }
     @Override
     public void turnOn(){
         System.out.println(" Apple turns on ");
     }
     @Override
     public void type(){
         System.out.println("You can type with Apple");
     }
}
class Lenovo extends ClassComputer{
    @Override
    public void turnOn(){
        System.out.println("Lenovo turns on ");
    }
    @Override
    public void type(){
        System.out.println("You can type with Lenovo");
    }
    public void play(){
        System.out.println("with Lenovo you can play the video games  ");
    }

}class HP extends ClassComputer{
    @Override
    public void turnOn(){
        System.out.println("HP turns on ");
    }
    @Override
    public void type(){
        System.out.println("You can type with HP");
    }
}class Dell extends ClassComputer{
    @Override
    public void turnOn(){
        System.out.println("Dell turns on ");
    }
    @Override
    public void type(){
        System.out.println("You can type with Dell");
    }
}