package class11;

public class E15String {
    public static void main(String[] args) {
        String str="break";
        if (!str.isEmpty()){
            int len=str.length();
            if(str.length()%2!=0&&str.length()>=3){
                System.out.println(str.charAt(len/2));
            }

        }

    }
}
/*public class T4String {
    public static void main(String[] args) {
        String str="hello";

        if(!str.isEmpty()){
            int len=str.length();
            if(len>=3&& len%2!=0){
                System.out.println(str.charAt(len/2));
            }

        }
    }
}*/