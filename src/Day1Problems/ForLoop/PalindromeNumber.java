package Day1Problems.ForLoop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        int temp=num;
        int rev=0;
        for(;num!=0;num/=10){
            int n=num%10;
            rev=rev*10+n;
        }
        if(temp==rev)
            System.out.println(temp+ " is a Palindrome Number!");
        else
            System.out.println(temp+ " is NOT a Palindrome Number!");
    }
}
