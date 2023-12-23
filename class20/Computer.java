package class20;
//abstract means something is not completed, every abstract class must
//we can not create and object of an abstract class.
//participate inheritance
public abstract class Computer {
    public static String name;
   public  String color;
   protected int memory;
    //optional           optional           must    must
//access modifiers-non access modifier-returnType name(){}
public Computer(String name,int memory,String color){
    this.name=name;
    this.memory=memory;
    this.color = color;
//OPTIONAL                     OPTIONAL                    MUST           MUST
//    ( Access Modifier          NON-access modifier      Return Type      Name(){}
//     Public,private,         (Static-Final-Abstract)
//     protected,default)

    }
   public static  void playMusic(){
        System.out.println("I can play music on my "+name);
}
protected void printInfo(){
    System.out.println("I have "+name+" computer with "+memory+" memory");
}
abstract void executeCode();
abstract void readEmails();

}
abstract class  Apple extends Computer{
    public Apple(String name,int memory,String color){
        super(name,memory,color);
    }
    //when we provide implementation to the abstract classes we MUST
    // follow rules overriding.Parameter and method name must be same
    // return type must be same.
    //Access modifiers must be same or more accessible.


 void executeCode(){
    System.out.println("Executing code on "+name+" ");
}
 void readEmail(){
    System.out.println(name+"can read emails");
}
}