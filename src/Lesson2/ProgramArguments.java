package Lesson2;

public class ProgramArguments {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]) + 1;
        String str1 = args[1] + "abc";
        String str2 = args[2] + "2";
        System.out.println(num + " " + str1 + " " + str2);
    }
}
