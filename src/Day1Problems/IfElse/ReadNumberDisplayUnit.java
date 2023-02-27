package Day1Problems.IfElse;

import java.util.Scanner;

public class ReadNumberDisplayUnit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println("Example: 1,10,100,1000");
        int num= in.nextInt();
        int p=1,n=0;
        String[] sd= new String[]{"Unit","Ten","Hundred","Thousand"};
        while(p<num){
            p=p*10;
            n++;
        }
        if(p==num)
            System.out.println(sd[n]);
        else
            System.out.println("!!!Enter a valid number!!!");
    }
}
  /*   Scanner in = new Scanner(System.in);
       System.out.println("Enter a number:");
       System.out.println("Example: 1,10,100,1000");
       String n= in.nextLine();
       int len=n.length();
       String[] sd= new String[]{"Unit","Ten","Hundred","Thousand"};
       System.out.println(sd[len-1]); */