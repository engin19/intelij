package homework;

public class Overload {

 static void overload1(String a){
        System.out.println(a+" am first");
    }
static void overload2(String a,String b){
    System.out.println(a+" am first then "+b);
}
static void overload3(String a,String b,String c){
    System.out.println(a+" am the first then "+b+" after that "+c);

}

    public static void main(String[] args) {
        Overload ol=new Overload();
        ol.overload1("I");
        ol.overload2("I","you");
        ol.overload3("I","you","others");
    }
}
