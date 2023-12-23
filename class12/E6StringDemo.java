package class12;

public class E6StringDemo {
    public static void main(String[] args) {
        String mname = "Mary";
        String fname = "Daniel";
        boolean isBoy = true;
        if (isBoy) {
            String name1 = mname.substring(mname.length() / 2, mname.length());
            String name2 = fname.substring(0, fname.length() / 2);
            System.out.println(name2.trim() + name1.trim());
        } else {
            String gname1 = fname.substring(0, fname.length() / 2);
            String gname2 = mname.substring(mname.length() / 2, mname.length());
                System.out.println(gname2 + gname1);





        }
    }
}
