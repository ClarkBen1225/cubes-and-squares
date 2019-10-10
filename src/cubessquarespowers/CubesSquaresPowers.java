/**
 * Ben Clark
 * Oct 10 2019
 * This program prompts the user to pick a choice to run a type of algorithm 
 */

package cubessquarespowers;

import java.util.Scanner;


public class CubesSquaresPowers {

  
    public static void main(String[] args) {
        //Declares the vairables that are used in calculating answers and seeing what choice was picked
       int option = 0;
       int option2 = 0;
       int answer = 0;
       int power = 0;     
        Scanner keyedInput = new Scanner(System.in);
        while(option !=4){
        //Menu of available choices 
        System.out.println("Please enter your choice");
        System.out.println("1... Find the value of a number squared");
        System.out.println("2... Find the value of a number cubed");
        System.out.println("3... Find the value of a number to any power");
        System.out.println("4... Exit");
        System.out.println("Please enter your choice");
        option = keyedInput.nextInt();
        
        if(option==1){
        System.out.println("Please enter your number");
        option2 = keyedInput.nextInt();
        answer= option2*option2;
        System.out.println("your number squared is " + answer);
        }
        if(option==2){
        System.out.println("Please enter your number");
        option2 = keyedInput.nextInt();
        answer= option2*option2*option2;
        System.out.println("your number squared is " + answer);
        }
        if(option==3){
        System.out.println("Please enter your number");
        option2 = keyedInput.nextInt();
        int number = option2;
        System.out.println("Please enter your power");
        power = keyedInput.nextInt();
        if(power>0){
        for( int i=1; i<power;i++){
            option2 = option2*number;  
        }
         System.out.println("your number to your chosen power is " + option2);
        }
        }
        // Ends program
        if(option==4){
        System.out.println("Program Finished");
    }
     }
   }
}
