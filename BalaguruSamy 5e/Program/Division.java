/**
 * Program: 
 * Using Assertion
 */

class Division{
   void checkAssertion(int a, int b){
      assert b != 0 : "The Value b cannot be ZERO";
      double c = a/b;
      System.out.println("The Result is " +c);
   }
   public static void main(String[] args) {
      Division div = new Division();
      div.checkAssertion(5, 0);
   }
}


/**
 * While Interpreting 
 * java -ea programName
 */