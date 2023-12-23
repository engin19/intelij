package Practice;

public class E1StringWithArrays {
    public static void main(String[] args) {

        String[] name={"ahmet","engin","engin","mehmet","engin","ahmet"};
        int coutn=0;
        for (int i=0;i<name.length;i++){
            if(name[i].equals("ahmet")){
                coutn++;
            }
        }
        System.out.println("there are "+coutn+ " times ahmet listed ");
    }
}
