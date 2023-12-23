package class14;

public class Cat {
    // instance variable

    String name="kitti";
    void printname(){
        //local variable; local variable always have the priority......
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printname();
    }
}
