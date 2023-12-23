package class19;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].eat();
            arr[i].sleep();

        }
    }
}
