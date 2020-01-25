/**
 * Program:
 * This program will show outcome of some arithmetic operations
 */

class Arithmetic{
   public static void main(String[] args) {
      // division and mod
      System.out.println(5/2 +" "+ 5%2 +" "+ 4/2 +" "+ 4%2);
      // Expression evaluation
      int count = 12;
      int num = 5;
      int val = 10;
      System.out.println( count*num+88/val-19%count );
      // unary operation
      int i = 10;
      i = -1;
      System.out.println("This is "+ i);
      // Expression evaluation
      System.out.println(5 % 3 + 1);
      System.out.println(5 / 3 + 1);
      System.out.println(5 * 3 + 1);
      System.out.println( ((10) + (((5))) / 9) );
      System.out.println( -5.6 % 3.3 );
      System.out.println( 5.6 % -3.3 );
   }
}