package Day1Problems.OperatorPrograms;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date and the number of the month:");
        int d= in.nextInt();
        int m= in.nextInt();
        String[] mn= new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(m>=1&&m<=12){
            switch (m) {
                case 3:
                    if (d >= 20 && d <= 31)
                        System.out.println("TRUE! " +mn[m-1]+ " " + d + " is between March 20 and June 20.");
                    else
                        System.out.println("FALSE! " +mn[m-1]+ " " +d+ " is not between March 20 and June 20.");
                    break;
                case 4:
                    if (d >= 1 && d <= 30)
                        System.out.println("TRUE! " +mn[m-1]+ " " + d + " is between March 20 and June 20.");
                    else
                        System.out.println("Enter a valid date!");
                    break;
                case 5:
                    if (d >= 1 && d <= 31)
                        System.out.println("TRUE! " +mn[m-1]+ " " + d + " is between March 20 and June 20.");
                    else
                        System.out.println("Enter a valid date!");
                    break;
                case 6:
                    if (d >= 1 && d <= 20)
                        System.out.println("TRUE! " +mn[m-1]+ " " + d + " is between March 20 and June 20.");
                    else
                        System.out.println("FALSE! " +mn[m-1]+ " " +d+ " is not between March 20 and June 20.");
                    break;
                default:
                    System.out.println("FALSE! " +mn[m-1]+ " " +d+ " is not between March 20 and June 20.");
            }
        }
        else
            System.out.println("Enter a valid month!");
    }
}
