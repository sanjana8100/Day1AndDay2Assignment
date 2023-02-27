package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        int min= a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("********************************************");
        System.out.println("Smallest Element in the Array: " +min);
    }
}
