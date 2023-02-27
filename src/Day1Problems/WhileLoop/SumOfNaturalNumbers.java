package Day1Problems.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        int i=1,sum=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of " +num+ " natural numbers: " +sum);
    }
}
