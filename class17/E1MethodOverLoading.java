package class17;
class Math{
   /*This is called Method Overloading.
    Method Overloading happens when-same name methods but with different parameters.
    When you overload the method, others who use your methods, will be able to add
    a lot of types of data with one method.You basically make their lives easier.

    Creating same methods and method names, but different parameters.compare lines 6 and 9.
    We can also change data types.lines 3 and 6, compare.3.We can also do Overloading method by changing the same parameters and data types,
    but different sequence.Compare lines 15 and 19.
            */
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2,double num3){
        System.out.println(num1+num2+num3);
    }
}
public class E1MethodOverLoading {
    public static void main(String[] args) {
        Math.add(10.5,20.7,20.5);
        Math.add(10,20);
        Math.add(10.5,20.7);
    }
}
