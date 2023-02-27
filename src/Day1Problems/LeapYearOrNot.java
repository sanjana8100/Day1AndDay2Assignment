package Day1Problems;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args){
        System.out.println("Enter an Year:");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
