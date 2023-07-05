//Guessing the number  
import java.util.Random;
import java.util.Scanner; 

public class GuessingTheNumber
{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String play="yes"; 
        while(play == "yes") 
        { 
            Random rand=new Random(); 
            int numberToGuess=rand.nextInt(100); 
            int guess=-1; 
            int tries=0; 

            while(guess!=numberToGuess) 
            { 
                System.out.println("Enter the guess number: "); 
                guess=sc.nextInt(); 
                tries++; 
                if(guess==numberToGuess) 
                { 
                    System.out.println("Awesome You guessed the number with in "+tries+"trials."); 
                    System.out.println("Congratulations"); 
                    play=sc.next().toLowerCase(); 
                } 
                else if(guess>numberToGuess) 
                { 
                    System.out.println("Your Guess number little higher than expected number,try again"); 
                } 
                else 
                { 
                    System.out.println("Your Guess number little lesser than expected number,try again"); 
                }
            }

        }
    }
}