package class14;

public class StudentsTester {



    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    public static void main(String[] args) {
        Students st1= new Students();

            st1.ID=277;
            st1.name="Engin";
        System.out.println(st1.ID);
        System.out.println(st1.name);
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


        Students st2= new Students();

        st1.ID=722;
        st1.name="Asghar";
        System.out.println(st1.ID);
        System.out.println(st1.name);
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);

    }
}
