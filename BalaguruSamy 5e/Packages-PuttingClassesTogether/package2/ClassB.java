/**
 * Program:
 * Creating a user defined package
 * 
 * 
 * NOTE:
 *    Compile the package to generate class file for other class to use
 */

package package2; // Defining a user defined package
public class ClassB{ // Class should always be "public"
   protected int value = 100;    

   public void displayB(){
      System.out.println("Path to this method: package2.ClassB.displayB();");
      System.out.println("\tValue = "+ value);
   }
}