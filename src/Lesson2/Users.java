package Lesson2;

public enum Users {
    ALEX("Alex","qwertY1", "Administrator"), MARK("Mark","ewq", "CustomerService"), LESYA("Lesya","qazS", "Analyst"), PETRO("Petro","1234", "Customer");
    private String name;
    private String password;
    private String group;

    Users(String name, String password, String group){
        this.name = name;
        this.password = password;
        this.group = group;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getGroup(){
        return group;
    }
}
 class Test{
    public static void main(String[] args) {
        Users alex = Users.valueOf("ALEX");
        String alexName = alex.getName();
        String alexPassword = alex.getPassword();
        String alexGroup = alex.getGroup();

        Users mark = Users.valueOf("MARK");
        String markName = mark.getName();
        String markPassword = mark.getPassword();
        String markGroup = mark.getGroup();

        Users lesya = Users.valueOf("LESYA");
        String lesyaName = lesya.getName();
        String lesyaPassword = lesya.getPassword();
        String lesyaGroup = lesya.getGroup();

        Users petro = Users.valueOf("PETRO");
        String petroName = petro.getName();
        String petroPassword = petro.getPassword();
        String petroGroup = petro.getGroup();

        if (alexName == args[0] && alexPassword == args[1] && alexGroup == args[2]){
            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have all the permissions");
        }
        else if (markName == args[0] && markPassword == args[1] && markGroup == args[2]){
            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have specific permission");
        }
        else if (lesyaName == args[0] && lesyaPassword == args[1] && lesyaGroup == args[2]){
            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have view and buy permissions");
        }
        else if (petroName == args[0] && petroPassword == args[1] && petroGroup == args[2]){
            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have reports permissions");
        }
        else {
            System.out.println("Incorrect credentials!");
        }
    }
}
