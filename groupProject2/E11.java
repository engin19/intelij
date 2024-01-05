package groupProject2;

public class E11 {
    //Create an Interface 'Shape' with undefined methods as calculateArea and
    //calculatePerimeter. Create 2 classes Circle & Square that implements
    //functionality defined in the Shape Interface. Test your code.
}
interface Shape{
    public void calculateArea();
   public void calculatePerimeter();
}
class Circle implements Shape{

    double radius=7;
    static double pi=3.14;

    @Override
    public void calculateArea( ) {

        System.out.println(radius*radius*pi);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*radius*pi);
    }
}
class Square implements Shape{
double width=6;
double height=12;

    @Override
    public void calculateArea() {
        System.out.println(width*height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(width+height));
    }}
class ShapeTester{
    public static void main(String[] args) {
        Shape c= new Circle();
        Shape s= new Square();
        s.calculateArea();
        s.calculatePerimeter();
        c.calculateArea();
        s.calculatePerimeter();
    }
}