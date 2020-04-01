/*
 * This program receives a word or sentence as an input from the user and checks
 * if it is a palindrome.
 */

import java.util.*;
public class Palindrome {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word or sentence");
        String input = sc.nextLine();
        String inputLetters = input.replaceAll("[\\W]", "");
        
        String check = "";
    
        int length = inputLetters.length();
        
        for (int i = length - 1 ; i >= 0; i--){
            check = check + inputLetters.charAt(i);
        }
        
        if (inputLetters.equalsIgnoreCase(check)){
            System.out.println("This word/sentence is a palindrome.");
        } else{
            System.out.println("This word/sentence is not a palindrome.");
        }    
    }
    
}
