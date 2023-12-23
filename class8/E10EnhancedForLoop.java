package class8;

public class E10EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers={100,100,25,30,25,50,300};
        int dby5=0;
        int dby2=0;
        for(int n:numbers){
            if (n%2==0){
                dby2++;}
            if (n %5==0){
                dby5++;


            }
        } System.out.println(dby2);
        System.out.println(dby5);

    }
}

