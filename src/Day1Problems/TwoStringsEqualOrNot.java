package Day1Problems;

import java.util.Scanner;

public class TwoStringsEqualOrNot {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = in.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = in.nextLine();

        if(string1.equals(string2)) {
            System.out.println("Both Strings are EQUAL");
        }
        else{
            System.out.println("Both Strings are UNEQUAL");
        }
    }
}
