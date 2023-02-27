package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class DisplayDuplicateElementsArray {
    public static void main(String[] args){
        int c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        System.out.println("The Duplicate Elements of the Array are:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+ " ");
                    c++;
                }
            }
        }
        if(c==0)
            System.out.println("NONE");
    }
}
