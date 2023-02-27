package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class ArrayElementsInReverse {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        System.out.println("**********************************************************");
        System.out.println("The Elements of the Array are:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
        System.out.println();
        System.out.println("The Elements of the Array in Reverse order:");
        for(int i=n-1;i>=0;i--)
            System.out.print(a[i]+ " ");
    }
}
