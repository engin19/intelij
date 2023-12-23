package reviewWeek8;

public class SportTester {
    public static void main(String[] args) {
        Sport sport=new Sport("Soccer","Fenerbahce");
        System.out.println(sport.type+" "+sport.teamName);
        System.out.println(sport.numberOfPlayers);
        sport.play();
        Sport sport1 =new Sport("Basketball", "Fenerbahce","Istanbul Kadikoy",26,"Ismail Kartal ");
        System.out.println(sport1);
        }
    }

