package class19;

public class Student {
public void study(){
    System.out.println("Student Study ");
}
public void eat(){
    System.out.println("Student eats ");
}
public void sleep(){
    System.out.println("Student sleep");
}
}
class SyntaxStudent extends Student{
    public void studyJava(){
        System.out.println("Syntax students JAVA");
    }
    @Override
    public void study(){
        System.out.println("Student Study Java");
    }

}
class CollegeStudent extends Student{
public void studyEconomics(){
    System.out.println("Study Micro  ");
}
    public void study(){
        System.out.println("Student Study Economics");
    }
}
class SchoolStudent extends  Student{
    public void studyMath(){
        System.out.println("2+2=4");
    }
    @Override
    public void study(){
        System.out.println("Student Study algebra ");
    }
}