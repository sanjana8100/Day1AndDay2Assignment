package Day1Problems.IfElse;

import java.util.Scanner;

public class SingleDigitNumberToWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Single Digit Number:");
        int n=in.nextInt();
        String[] sd= new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"
        };
        if (n < 10) {
            System.out.println(sd[n]);
        }
        else{
            System.out.println("!!!Enter a Valid Number!!!");
        }
    }
}
