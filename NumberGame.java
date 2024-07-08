import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    private static int i;
    public static void main(String[]args){
        Random rand=new Random();
        int number=rand.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);
        int guess;
        int k=5;
        System.out.println("Welcome to number game");
        System.out.println("Guess a number between 1 to 100");
        while(k>0){
                guess=scanner.nextInt();
                if(guess==number){
                    System.out.println("Congrats!You guessed the right number");
                    break;
                }
                else if(guess<number){
                    System.out.println("Your guess is too low,Try Again...");
                }
                else{
                    System.out.println("Your guess is too high,Try Again...");
                }  
                k--;
                System.out.println("You have "+k+" chances left");
        }
        switch(k){
             case 1:
                 if(k==1){
                     System.out.println("Your score is 20");
                     break;
                 } 
             case 2:
                 if(k==2){
                     System.out.println("Your score is 40");
                     break;
                 }        
             case 3:
                 if(k==3){
                     System.out.println("Your score is 60");
                     break;
                 }        
             case 4:
                 if(k==4){
                     System.out.println("Your score is 80");
                     break;
                 }        
             case 5:
                 if(k==5){
                     System.out.println("Your score is 100");
                     break;
                 }   
             default:
                  System.out.println("Your score is 0");  
                  break;   
        }
    }  
}