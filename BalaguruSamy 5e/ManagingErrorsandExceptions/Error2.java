/**
 * This Program contain error
 * 
 * NOTE:
 * This will generate class file
 */

class Error2{
   public static void main(String[] args) {
      int a = 10, b = 5, c = 5;
      int x = a /(b -c);
      System.out.println("Value of x : "+x);
      int y = a/(b + c);
      System.out.println("Value of y : "+y);
   }
}


/**
 * Expected Output:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Error2.main(Error2.java:11)
 */