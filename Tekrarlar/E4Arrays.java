package Tekrarlar;

public class E4Arrays {
    int num(int []arr){
        int num=0;
        for (int n:arr) {
            num=num+n;

        }return num;
    }

    public static void main(String[] args) {
        E4Arrays sum=new E4Arrays();
        int[] array={25,36,85,78};
        System.out.println(sum.num(array));
    }
}
