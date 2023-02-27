package Day1Problems.ForLoop;

import java.util.Scanner;

public class ReverseTheIntegerNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        System.out.println("**********************************");
        System.out.println("Original Number: " +num);
        int rev=0;
        for(;num!=0;num/=10){
            int n=num%10;
            rev=rev*10+n;
        }
        System.out.println("Reversed Number: " +rev);
    }
}
