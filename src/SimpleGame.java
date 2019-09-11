/*
Author: Thoithoi Shougrakpam
Date: 9/9/19
Description: A simple roll of dice game.
 */
import java.lang.Math;
import java.util.Scanner;

 class SimpleGame {

    public static void main(String[] args){
        //initializing a string to stop the while loop
        String ans = "yes";
        int roll=0;
        //converting string to lowercase
        while ((ans.toLowerCase()).equals("yes")) {
            int sum=0;
            int num1, num2;
            //using the Math.random to generate the dices rolls
            num1=num2= (int) (Math.random()*((6-1)+1))+1;
            sum=num1+num2; roll+=1;
            System.out.printf("Tosses %d %d \n", num1, num2);
            //checking is sum is equals to 8
            if (sum== 8){
                System.out.printf("You won in %d rolls", roll);
                //update the string value
                Scanner ansUpdate = new Scanner(System.in);
                System.out.println("Play again? Yes/No");
                ans= ansUpdate.nextLine();
            }
        }

    }
}
