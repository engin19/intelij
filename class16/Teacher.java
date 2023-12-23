package class16;

public class Teacher {
    String name;
    int age;

    public void teach() {
        System.out.println(" Teaches ");


    }

    public void sleep() {
        System.out.println("Sleeps");
    }

    public void read() {
        System.out.println("Reads");
    }

    public void run() {

        System.out.println("Runs ");

}
}

class MathTeacher extends Teacher{

    }


class PianoTeacher extends Teacher{


}
class ChemistryTeacher extends Teacher {


}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher m=new MathTeacher();
        m.teach();
        PianoTeacher p=new PianoTeacher();
        p.sleep();
        ChemistryTeacher c=new ChemistryTeacher();
        c.read();
    }
}