package reviewWeek8;

public class Sport {
//DataType name is must on variable
    // instance  variable
    String type,teamName;
    int numberOfPlayers;
    String location,coach;

// TWO CONSTRUCTORS  DOWN IS CALLED OVERLOADING ADDED THE FIRST CONSTRUCTOR FEW MORE PARAMETER
    Sport(String type,String teamName){
        this.type=type;
        this.teamName=teamName;
    }
    Sport(String type,String teamName,String location, int numberOfPlayers,String coach){
        this(type,teamName);
        this.location=location;
        this.numberOfPlayers=numberOfPlayers;
        this.coach=coach;

    }




// static variable
static boolean fun;



//return type and name are the
// MUST WE NEED TO HAVE THEM!!!!!!!!
    void play(){
        System.out.println("We play "+type);
    }

void watch (String stream){
    System.out.println("I am watching "+type+" on "+stream);
}
}
