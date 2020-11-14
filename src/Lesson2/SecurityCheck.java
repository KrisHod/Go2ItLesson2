package Lesson2;

public class SecurityCheck {
    public static void main(String[] args) {
        String usernamePassword = "Kris|qwerty";
        int index = usernamePassword.indexOf('|');
        String name = usernamePassword.substring(0, index);
        String password = usernamePassword.substring(index + 1);
        if (name.equals(args[0]) && password.equals(args[1])){
            System.out.println("Welcome, " + args[0] + "!");
        }
        else {
            System.out.println("Incorrect username/password");
        }
    }
}
