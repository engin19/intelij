package reviewWeek8;

public class Doctor {
    public static String hospital;
   public String firstName , lastName;
   protected String speciality;
   int yearsOfExperience;
   private double salary;

   public Doctor(String firstName,String lastName,String speciality,int yearsOfExperience){
       this.firstName=firstName;
       this.lastName=lastName;
       this.speciality=speciality;
       this.yearsOfExperience=yearsOfExperience;

   }
  public static void work(){
      System.out.println("Doctors work at "+hospital);
  }
  protected void checkVitals(){
      System.out.println(firstName+" "+lastName+"checks vitals on every patients ");
  }
    /*What is overloading; in the same class we have method with same name.
     how to overload: changing number of parameter or dataType or sequence
     in overloading;  the method signature MUST be different
     we dont care about returnType doesnt make any change.
     we dont care about access modifiers
      just changing returntype or access modifiers doesnt consider as method overloading.
      method overloading happens in the SAME CLASS.

     * */
   protected void checkVitals(String patient){
        System.out.println(firstName+" "+lastName+"checks vitals on "+patient );
    }
protected void prescribeMedication(String medication){
    System.out.println(firstName+" "+lastName+" prescribed"+medication);
}
}
class Surgeon extends Doctor {
    String location;

    Surgeon(String firstName, String lastName, String speciality, int yearsOfExperience) {
        super(firstName, lastName, speciality, yearsOfExperience);// call to the constructor always happens first
        this.location = location;

    }

/* Method overriding; If subclass (child class) and the parent class have a method with the same name.
how to override; we need inheritance.
                 WE must keep same name, parameters and return type.
                 in overriding  METHOD SIGNATURE  MUST BE THE SAME.
                 aCCESS  modifiers must be same or wider access .

 */
    public void prescribeMedication(String patient){
        System.out.println("Surgeon "+lastName+"prescribed medication to "+patient);
    }

}
