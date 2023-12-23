package class18;

public class Degree {

public void getPrerequisite(){

    System.out.println("You need to have your high school diploma ");
}

}
class Bachelors extends Degree {
    public Bachelors(){
        System.out.println("You need to have your high school diploma");

        }
}
class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("You  need to have your bachelor degree ");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Masters m=new Masters();
        m.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();

    }
}