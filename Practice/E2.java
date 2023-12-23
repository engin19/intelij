package Practice;

public class E2 {
    public static void main(String[] args) {
        int[] num={10,20,30,40,45,55,25,80,90};
        int even=0, odd=0;
        for (int i=0; i< num.length; i++){
        if (num[i]%2==0){
            even=even+num[i];
        }else{
            odd=odd+num[i];
        }

        } System.out.println(even);
        System.out.println(odd);

    }

}

