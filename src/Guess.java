/*
 * This program generates a random number between 0 and 100 and asks the user to
 * guess it.
 */

import java.util.*;

public class Guess {
    public static void main(String[] args){
    
        int count = 1;
        
        Random random = new Random();
        int number = random.nextInt(101);
            
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Guess the number between 0 and 100");
        int guess = sc.nextInt();
                    
        while (count < 10){
           
            if (guess == number){
                
                System.out.println("Correct! Would you like to play again? Y/N");
                String answer = sc.nextLine();
                
                if (answer.equals("Y")){
                    count = 0;
                    number = random.nextInt(101);
                    System.out.println("Guess the number between 0 and 100");
                    count ++;
                    guess = sc.nextInt();
                } else if (answer.equals("N")){
                    System.out.println("Goodbye!");
                    count = 10;
                }
            } else {
                System.out.println("Incorrect, trials remaining: " + (10 - count));
                count ++;
                guess = sc.nextInt();
                if (count == 10){
                    System.out.println("You have run out of tries, better luck next time!");
                }
            }
        }
    }
}
