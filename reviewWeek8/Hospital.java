package reviewWeek8;

import reviewWeek8_1.Orthodontist;

public class Hospital {

    public static void main(String[] args) {

        Doctor.hospital="Baylor";
Surgeon surgeon=new Surgeon("John","Doe","Surgeon",20);
        surgeon.checkVitals();
surgeon.checkVitals("Jane Smith");
surgeon.prescribeMedication("Smith");
Doctor.work(); /*when we have a static method  we need to call with the Class name (Doctor)

 */
  Surgeon.work();// accessing static method from parent class in static way using the child class name

        Orthodontist orthodontist=new Orthodontist("Josh","Doe"," orthodontist",25);
        Orthodontist.work();//parent
        orthodontist.checkVitals();//parent
        orthodontist.prescribeMedication("Pain killers");//child
        orthodontist.printSpeciality();//child

    Doctor ortho1=new Orthodontist("Josh","Smith"," Orthodontist",25);
    ortho1.checkVitals();
    ortho1.checkVitals("Michael");

    Doctor sur=new Surgeon("John","hoe","Surgeon",25);
sur.checkVitals();
sur.checkVitals("Engin");
sur.prescribeMedication("pills");
}
}
