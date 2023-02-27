package Day1Problems.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        for(int i=1;i<=num;i++)
            sum=sum+i;
        System.out.println("The sum of " +num+ " natural numbers: " +sum);
    }
}
