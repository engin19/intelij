public class deneme {
    public static void main(String[] args) {
        int [] temp={100,65,90,80,78,88,75};
        int max=temp[0];
        int min=temp[0];
        for (int i = 1; i <temp.length ; i++) {
            if (temp[i]>max){
                max=temp[i];
            }if (temp[i]<min);


        }
        System.out.println(max);
        System.out.println(min);
    }
}
