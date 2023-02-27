package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class OddPositionElementsArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        System.out.println("The Elements in the Array with odd position:");
        for(int i=0;i<n;i++){
            if(i%2!=0)
                System.out.println(a[i]);
        }
    }
}
