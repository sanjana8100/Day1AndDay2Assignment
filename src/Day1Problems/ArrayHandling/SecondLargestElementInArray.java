package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args){
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The Second Largest Element of the Array is: " +a[n-2]);
    }
}
