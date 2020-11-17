package Lesson2;

public class Arrays {
    public static void main(String[] args) {
        String usernamePassword = "Alex|qwertY1";
        String[] dividedNamePassword = usernamePassword.split("\\|");

        if (args[0].contains("password")){
            String[] password = args[0].split("=");
            String[] name = args[1].split("=");
        }
        else if (args[0].contains("name")){
            String[] password = args[1].split("=");
            String[] name = args[0].split("=");
        }

        if (password[1].equals(dividedNamePassword[1])){
            System.out.println("Login successful");
        }
    }
}
