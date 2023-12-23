package class15;

public class Dog {
   private String name;
    private String breed;
    private String color;
    private  int age;
    Dog (String dname,String dbreed,String dcolor,int dage){
        name=dname;
        breed=dbreed;
        color=dcolor;
        age=dage;
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);}




}
