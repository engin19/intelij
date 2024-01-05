package groupProject2;

public class E12 {
    //We have to calculate the average of marks obtained in three subjects by
    //student A and by student B. Create class 'Marks' with an abstract method
    //'getPercentage' that will return the average percentage of marks. Provide
    //implementation of abstract methods in classes 'A' and 'B'. The constructor of
    //student A takes the marks in three subjects as its parameters and the marks
    //in four subjects as its parameters for student B. Test your code

}
 abstract class Marks{
    double mark1;
    double mark2;
    double mark3;
   static double average;
    double getPercentage(double mark1,double mark2,double mark3){
        return average;
    }
}
class A extends Marks {
    double mark4;





    @Override
    double getPercentage(double mark1, double mark2, double mark3 ) {
        return super.getPercentage(mark1, mark2, mark3);

    }
    double getPercentage(double mark1, double mark2, double mark3,double mark4) {
        return getPercentage(0.0, 0.0, 0.0,0.0);
    }
}class B extends Marks {
    @Override
    double getPercentage(double mark1, double mark2, double mark3) {
        return super.getPercentage(mark1, mark2, mark3);

    }
}
class MarkTester{
    public static void main(String[] args) {
        Marks a= new A();
        System.out.println(a.getPercentage(95,65,88));

    }
}