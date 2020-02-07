/**
 * Program:
 * Program that outputs a table of numbers,
 * Each line contain- number, its square, and its cube
 */

class Table {
   public static void main(String[] args) {
      for(int i= 1; i<= 10; i++)
         System.out.println("Number: "+ i +"\tSquare: "+ Math.pow(i,2) +"\tCube: "+ Math.pow(i,3));
   }
}