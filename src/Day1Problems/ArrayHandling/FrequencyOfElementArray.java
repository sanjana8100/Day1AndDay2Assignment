package Day1Problems.ArrayHandling;

import java.util.Scanner;

public class FrequencyOfElementArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        int[] f=new int[n];
        int visited=-1;
        for(int i=0;i<n;i++){
            int count=1;
            if(f[i]!=visited){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        count++;
                        f[j]=visited;
                    }
                }
            }
            f[i]=count;
        }
        System.out.println("**********************************");
        System.out.println("  Elements : Frequency");
        for(int i=0;i<f.length;i++){
            if(f[i]!=visited)
                System.out.println("     "+a[i]+"     :     "+f[i]);
        }
    }
}
