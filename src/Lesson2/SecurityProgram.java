package Lesson2;

public class SecurityProgram {
    public static void main(String[] args) {
        final String PASSWORD = "Qwer123";
        String name = args[0];
        String password = args[1];
//        if (PASSWORD.equals(password)){
//            System.out.println("Hello, " + name + ". The password you entered is validated - true");
//        }
//        else {
//            System.out.println("Hello, " + name + ". The password you entered is validated - false");
//        }

        System.out.println("Hello, " + name + ". The password you entered is validated - " + (PASSWORD.equals(password)));
    }
}
