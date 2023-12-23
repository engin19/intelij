package class10;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        person.nationality="American";
        person.age=40;
        person.race="White";
        person.Weight=200;
        System.out.println(person.age);
        System.out.println(person.race);
        System.out.println(person.nationality);
        System.out.println(person.Weight);
        person.run();
        person.likes();
        person.work();


    }
}
