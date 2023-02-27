package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class PrintElementsArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
    }
}
