package class14;

public class SyntaxEmployeeTester {

    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=123;
        emp1.salary=35000;
        System.out.println(emp1.salary);
        System.out.println(emp1.empID);
        System.out.println(SyntaxEmployee.Ceo);
        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=456;
        emp2.salary=75000;
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
        System.out.println(SyntaxEmployee.Ceo);

    }
}
