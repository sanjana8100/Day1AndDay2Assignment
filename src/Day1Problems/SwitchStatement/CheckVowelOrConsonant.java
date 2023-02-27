package Day1Problems.SwitchStatement;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch= in.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch+ " is a VOWEL");
                break;
            default:
                System.out.println(ch+ " is a CONSONANT");
        }
    }
}
