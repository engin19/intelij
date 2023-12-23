package class17;

public class Task2 {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/
    static void overLoad(){
        System.out.println("Overloading example with 0 parameter");


    }
static void overLoad(int a){
    System.out.println("Overloading Example with"+a+" parameter ");
}
static void overLoad(int a,String b){
    System.out.println("Overloading example with 2 parameter");

}

    public static void main(String[] args) {
        Task2 t=new Task2();
        t.overLoad();
        t.overLoad(1);
        t.overLoad(1,"Java");
    }

}
