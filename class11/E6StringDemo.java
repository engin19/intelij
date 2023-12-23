package class11;

public class E6StringDemo {
    public static void main(String[] args) {
        String username="Username";
        String password1="Password123";
        String password2="Password123";

        if (username.isEmpty()||password1.isEmpty()){
            System.out.println("Username and Password can not be empty");
        }else if (password1.length()<8){
            System.out.println("Password is too short");
        }else if (password1.contains(username)){
            System.out.println("Password can not contain username");
        }else if (!password1.equals(password2)){
            System.out.println("Password do not match");
        }else{
            System.out.println("You created an account");
        }

    }
}
