package Day1Problems.OperatorPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        double r1,r2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a,b and c for a quadratic equation:");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        double d= (b*b)-(4.0*a*c);
        if(d>0.0){
            r1= (-b + Math.pow(d,0.5))/(2.0*a);
            r2= (-b - Math.pow(d,0.5))/(2.0*a);
            System.out.println("The roots are:");
            System.out.println("r1= " +r1+ " and r2= " +r2);
        }
        else if(d==0.0){
            r1= -b/(2.0*a);
            System.out.println("The root is:");
            System.out.println("r1= " +r1);
        }
        else
            System.out.println("Roots are not real.");
    }
}
