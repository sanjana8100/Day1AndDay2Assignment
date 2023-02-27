package Day1Problems.OperatorPrograms;

import java.util.Scanner;

public class ArithmeticOperationsMaxMin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values for a,b and c:");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        System.out.println("***********************************");
        System.out.println("The values entered are:");
        System.out.println("a:" +a+ "  b:" +b+ "  c:" +c);
        if(a>=b&&a>=c)
            System.out.println(a+ " is the MAXIMUM number.");
        else if(b>=a&&b>=c)
            System.out.println(b+ " is the MAXIMUM number.");
        else
            System.out.println(c+ " is the MAXIMUM number.");

        if(a<=b&&a<=c)
            System.out.println(a+ " is the MINIMUM number.");
        else if(b<=a&&b<=c)
            System.out.println(b+ " is the MINIMUM number.");
        else
            System.out.println(c+ " is the MINIMUM number.");

        System.out.println("The value of a+b*c is: " +(a+b*c));
        System.out.println("The value of c+a/b is: " +(c+a/b));
        System.out.println("The value of a%b+c is: " +(a%b+c));
        System.out.println("The value of a*b+c is: " +(a*b+c));
    }
}
