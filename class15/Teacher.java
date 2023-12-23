package class15;

public class Teacher {
    private String name;
    private String address;
    private int age;
    private double weight;



    public Teacher(String name, String address,int age,double weight) {
        this(name,address,age);
        this.weight = weight;
    }
        public Teacher(String name, String address,int age) {
        this.name = name;
        this.address = address;
        this.age=age;
        ;
    }


    public void printinfo(){
        System.out.println(this.name+" "+this.address);
    }

    public static void main(String[] args){
        Teacher t1=new Teacher("Asghar","Pakistan",30,80);
        t1.printinfo();
    }





}
