/**
 * Program:
 * Twenty one stick is a simple console-based gaming application developed in 
 * java. It starts with a collection of twenty one sticks and prompts tha user 
 * to pick either one or two sticks in one attempt. Based on the users choice, 
 * the computer makes its own choice. Eventually, whosoever picks the last stick 
 * loses the game. The users is prompted at the beginning of the game to make a 
 * choice whether he wants to play first.
 * 
 * The various variables used in this progam:
 * 1. TwentyOneSticks: is the main class which contains the entire code.
 * 2. no_of_sticks: is the variable that store the numbr of sticks currently
 *                   available. Initially, it is assigned the value of 21.
 * 3. input_num: stores he number of sticks chosen by the computer or users.
 * 
 * 
 * The objectives of the Twenty One Sticks application are as follows:
 * 1. To create a simple console-based game in java.
 * 2. To use decision making constructs for applying the games logic
 */

import java.util.Scanner;

public class TwentyOneStick{
   public static void main(String[] args) {
      int no_of_sticks = 21;
      System.out.println("Do you want to play first? (y/n)");
      Scanner input = new Scanner(System.in);
      String first_attempt = input.nextLine();
      Scanner read_next = new Scanner(System.in);
      int input_num = 0;

      while(no_of_sticks > 0){
         if(first_attempt.equals("y") || first_attempt.equals("Y")){
            System.out.println("Currently " +no_of_sticks+ " sticks avaiable");
            System.out.println("Pick your sticks (1 or 2)");
            input_num = read_next.nextInt();

            if(input_num > 2){
               input_num = 2;
            } else if(input_num < 1){
               input_num = 1;
            }

            no_of_sticks = no_of_sticks - input_num;

            if(no_of_sticks <= 0){
               System.out.println("!!! You have lost the game !!!");
            } else{
               if(((no_of_sticks - 2) % 3) == 0 || (no_of_sticks - 2) == 0){
                  input_num = 1;
               } else{
                  input_num = 2;
               }
               System.out.println("Your Opponent picks : " + input_num+ " sticks");
               no_of_sticks -= input_num;
               if(no_of_sticks <= 0){
                  System.out.println("!!! You have won the game !!!");
               }
            }
         }else{
            if(((no_of_sticks - 2) % 3) == 0 || (no_of_sticks - 2) == 0){
               input_num = 1;
            } else{
               input_num = 2;
            }
            System.out.println("Your Opponent picks : " + input_num+ " sticks");
            no_of_sticks -= input_num;
            if(no_of_sticks <= 0){
               System.out.println("!!! You have won the game !!!");
            } else{
               System.out.println("Currently " +no_of_sticks+ " sticks avaiable");
               System.out.println("Pick your sticks (1 or 2)");
               input_num = read_next.nextInt();

               if(input_num > 2){
                  input_num = 2;
               } else if(input_num < 1){
                  input_num = 1;
               }

               no_of_sticks = no_of_sticks - input_num;

               if(no_of_sticks <= 0){
                  System.out.println("!!! You have lost the game !!!");
               }
            }
         }
      }
   }
}