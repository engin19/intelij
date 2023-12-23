package class15;

public class Person {
    private String name;
    private int age;
    private  double weight;
    private double salary;
    private     String favPLanguage;
   public Person(String Pname,int Page,double Pweight,double Psalary,String PfavLanguage){
name=Pname;
age=Page;
weight=Pweight;
salary=Psalary;
favPLanguage=PfavLanguage;

    }
    public Person(String Pname,int Page,double Pweight,double Psalary) {
        name = Pname;
        age = Page;
        weight = Pweight;
        salary = Psalary;
    }

        public void printInfo(){

            System.out.println(name+" "+age+" "+weight);
        }
   }
