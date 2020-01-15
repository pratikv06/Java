/**
 * Some More Example of COnditional Operator
 */
class ConditionalOperator{
   public static void main(String[] args) {
      // Example 1
      int x= 112;
      double flag = (x<0) ? 0 : 1 ;
      System.out.println("The Value of Example 1 is " + flag);

      // Example 2
      x= 3;
      flag = (x>2) ? (2*x+5) : (1.5*x+3);
      System.out.println("The Value of Example 2 is " + flag);

      // Example 3
      x= 40;
      flag = (x!=40) ? ((x<40) ? (4*x+100) : (4.5*x+150)) : 300;
      System.out.println("The Value of Example 3 is " + flag);
   }
}