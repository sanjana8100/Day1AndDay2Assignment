package Day1Problems;

import java.util.Scanner;

public class GetNameUsingCommandLine {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a Name:");
        String s1 = in.nextLine();
        System.out.println("Entered Name: " +s1);
    }
}
