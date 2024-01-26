package class24;

import java.util.TreeMap;

public class Person {
    private String name,lastName;
    private int age,salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        // void printInfo(name,lastName, age, salary){
           // System.out.println(name + " " + lastName + " " + age + " " + salary + ".");
        }
    }

class PersonTester{
    public static void main(String[] args) {
        TreeMap<Integer,Person> person=new TreeMap<>();
        person.put(1,new Person("Engin","Ozdemir",42,100000));
        person.put(2,new Person("Aileen","Ozdemir",6,1000000));
        person.put(3,new Person("Cooper","Ozdemir",5,10000));
        person.forEach((k,personObj)-> System.out.println("id"+k));

    }
}