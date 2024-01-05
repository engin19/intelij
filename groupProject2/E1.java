package groupProject2;

public class E1 {
    public static void main(String[] args) {


              /*  String str1 = "Hello";
                String str2 = "World";

                System.out.println("Before swapping:");
                System.out.println("String 1: " + str1);
                System.out.println("String 2: " + str2);

                // Swapping without temporary variable using concat() method
                str1 = str1 + str2;
                str2 = str1.substring(0, str1.length() - str2.length());
                //str1 = str1.substring(str2.length());
                str1=str1.replaceFirst("Hello","");
                System.out.println("After swapping:");
                System.out.println("String 1: " + str1);
                System.out.println("String 2: " + str2);*/
                String string1= "Syntax";
                String string2= "Students";
        System.out.println("Before swapping");
        System.out.println("String 1 :"+string1);
        System.out.println("String 2 :"+string2);
         string1=string1+string2;
         string2=string1.replaceAll("Students","").trim();
         string1=string1.replaceAll("Syntax","").trim();
        System.out.println("After swapping");
        System.out.println("String 1 :"+string1);
        System.out.println("String 2 :"+string2);

            }
        }
