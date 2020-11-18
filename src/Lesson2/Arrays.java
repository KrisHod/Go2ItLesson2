package Lesson2;

public class Arrays {
    public static void main(String[] args) {
        String usernamePassword = "Alex|qwertY1";
        String[] dividedNamePassword = usernamePassword.split("\\|");
        String arg1 [] = args[0].split("=");
        String arg2 []= args[1].split("=");

        if (args[0].contains("password")){
            if (arg1[1].equals(dividedNamePassword[1]) && arg2[1].equals(dividedNamePassword[0])){
                System.out.println("Login successful");
            }
            else {
                System.out.println("Login failed");
            }
        }
        else if (args[0].contains("name")){
            if (arg1[1].equals(dividedNamePassword[0]) && arg2[1].equals(dividedNamePassword[1])){
                System.out.println("Login successful");
            }
            else {
                System.out.println("Login failed");
            }
        }
    }
}
