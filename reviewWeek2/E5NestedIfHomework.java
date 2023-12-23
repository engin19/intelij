package reviewWeek2;

public class E5NestedIfHomework {
    public static void main(String[] args) {

double intrate=4.2;
int price=125000;

if (intrate>=4.5){
    System.out.println("They will not buy a house");
}else {
    System.out.println("They will consider buying a house");
    if (price <= 100000) {
        System.out.println("they will pay cash");
    } else {
        System.out.println("They will take a loan");
    }
}






    }
}
