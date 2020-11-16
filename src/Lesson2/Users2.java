package Lesson2;

public enum Users2 {
    ADMIN("Alex","qwertY1"), CUSTOMERSERVICE("Mark","ewq"), ANALYST("Lesya","qazS"), CUSTOMER("Petro","1234");
    private String name;
    private String password;

    Users2(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){

        return name;
    }
    public String getPassword(){
        return password;
    }
}
class Test2{
    public static void main(String[] args) {
String namePassword = args[0];
        String[] user = namePassword.split("/", 2);
    }

}
