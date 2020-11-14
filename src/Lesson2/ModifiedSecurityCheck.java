package Lesson2;

public class ModifiedSecurityCheck {
    public static void main(String[] args) {
        String[] namePasswordGroup = new String[4];
        namePasswordGroup[0] = "Kris|qwerty|Administrator";
        namePasswordGroup[1] = "Mark|ewk|CustomerService";
        namePasswordGroup[2] = "Lesya|qazS|Analyst";
        namePasswordGroup[3] = "Petro|1234|Customer";
        int[] index1 = new int[4];
        int[] index2 = new int[4];
        String[] name = new String[4];
        String[] password = new String[4];
        String[] group = new String[4];


        for (int i = 0; i < 4; i++) {
            index1[i] = namePasswordGroup[i].indexOf('|');
            index2[i] = namePasswordGroup[i].indexOf('|', index1[i] + 1);
            name[i] = namePasswordGroup[i].substring(0, index1[i]);
            password[i] = namePasswordGroup[i].substring(index1[i] + 1, index2[i]);
            group[i] = namePasswordGroup[i].substring(index2[i] + 1);
        }

        for (int i = 0; i < 4; i++) {
            if (name[i].equals(args[0]) && password[i].equals(args[1])) {
                if (group[i].equals(args[2])) {
                    switch (group[i]) {
                        case "Administrator":
                            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have all the permissions");
                            break;
                        case "CustomerService":
                            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have specific permission");
                            break;
                        case "Analyst":
                            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have view and buy permissions");
                            break;
                        case "Customer":
                            System.out.println("Welcome, " + args[0] + "! Your group is " + args[2] + " and you have reports permissions");
                            break;
                    }
                }
            }
        }
    }
}
