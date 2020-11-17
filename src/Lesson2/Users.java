package Lesson2;

public enum Users {
    ADMIN("all the permissions"), CUSTOMERSERVICE("specific permission"), ANALYST("view and buy permissions"), CUSTOMER("reports permissions");
    private String permission;

    Users(String permission){
        this.permission = permission;
    }

    public String getPermission(){
        return permission;
    }
}
class Test {
    public static void main(String[] args) {
String admin = "Alex|qwertY1|Admin";
String customerService = "Mark|ewq|CustomerService";
String analyst = "Lesya|qazS|Analyst";
String customer = "Petro|1234|Customer";

String[] adminCredentials = admin.split("\\|");
String[] customerServiceCredentials = customerService.split("\\|");
String[] analystCredentials = analyst.split("\\|");
String[] customerCredentials = customer.split("\\|");

if (adminCredentials[0].equals(args[0]) && adminCredentials[1].equals(args[1])){
    System.out.println("Welcome, " + args[0] + "! Your group is " + Users.ADMIN + " and you have " + Users.ADMIN.getPermission());
}
   else if (customerServiceCredentials[0].equals(args[0]) && customerServiceCredentials[1].equals(args[1])){
            System.out.println("Welcome, " + args[0] + "! Your group is " + Users.CUSTOMERSERVICE + " and you have " + Users.CUSTOMERSERVICE.getPermission());
        }
else if (analystCredentials[0].equals(args[0]) && analystCredentials[1].equals(args[1])){
    System.out.println("Welcome, " + args[0] + "! Your group is " + Users.ANALYST + " and you have " + Users.ANALYST.getPermission());
}
else if (customerCredentials[0].equals(args[0]) && customerCredentials[1].equals(args[1])){
    System.out.println("Welcome, " + args[0] + "! Your group is " + Users.CUSTOMER + " and you have " + Users.CUSTOMER.getPermission());
}
else {
    System.out.println("Incorrect username/password");
}

    }

}
