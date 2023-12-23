package homework;

public class Task13 {
    /*Create a method that will say Hello in different language based on the country
    that will passed when method is executed. Do it for any five countries
     */
void language(String hello){
    if(hello.equalsIgnoreCase("Ciao")){
        System.out.println("Italy");
    }else if (hello.equalsIgnoreCase("Hola")){
        System.out.println("Spain");
    }else if (hello.equalsIgnoreCase("Hej")){
        System.out.println("Sweden");
    }else if (hello.equalsIgnoreCase("Merhaba")){
        System.out.println("Turkiye");
    }else if (hello.equalsIgnoreCase("Hali")){
        System.out.println("Hungary");
    }
}
}