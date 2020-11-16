package Lesson2;

public class Arrays {
    public static void main(String[] args) {
        String usernamePassword = "Kris|qwerty";
        int index = usernamePassword.indexOf('|');
        String name = usernamePassword.substring(0, index);
        String password = usernamePassword.substring(index + 1);
        String inputPassword;
        String inputName;

if (args[0].contains("password")){
    inputPassword = args[0].substring(args[0].indexOf("=")+1);
    inputName = args[1].substring(args[1].indexOf("=")+1);
}
else if (args[0].contains("name")) {
             inputName = args[0].substring(args[0].indexOf("=")+1);
            inputPassword = args[1].substring(args[1].indexOf("=")+1);
}

if (name.equals(inputName) && password.equals(inputPassword)){
    System.out.println("Login successful");
}
else {
    System.out.println("Login failed");
}

    }
}
