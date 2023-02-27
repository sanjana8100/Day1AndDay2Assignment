package Day1Problems.OperatorPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        int x= in.nextInt();
        int y= in.nextInt();
        double ed= Math.pow((x*x+y*y),0.5);
        System.out.println("The Euclidean distance of ("+x+","+y+") to the origin (0,0) is " +ed);
    }
}
