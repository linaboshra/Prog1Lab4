/*
 * This program validates email addresses.
 */

import java.util.*;
public class Email {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an email address to validate");
        
        String input = sc.nextLine();
        
        boolean foundAt = false;
        boolean foundDot = false;
        
        for (int i = 0; i < input.length(); i++){
            if (!foundAt){
                if(input.charAt(i)=='@'){
                    foundAt = true;
                }
            } else if (!foundDot){
                if (input.charAt(i)=='.'){
                    foundDot = true;
                }
            }
        }
        if (foundAt && foundDot){
            System.out.println("This email is valid");
        } else {
            System.out.println("This email is invalid");
        }
    }
}
