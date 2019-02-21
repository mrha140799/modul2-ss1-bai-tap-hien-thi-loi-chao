package SS1BT1;

import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String str = scn.nextLine();
        System.out.println("Hello : " + str);
    }
}
