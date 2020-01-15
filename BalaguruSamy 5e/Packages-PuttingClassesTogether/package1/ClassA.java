/**
 * Program:
 * Creating a user defined package
 * 
 * 
 * NOTE:
 *    Compile the package to generate class file for other class to use
 */

package package1; // Defining a user defined package
public class ClassA{ // Class should always be "public"
   public void displayA(){
      System.out.println("Path to this method: package1.ClassA.displayA();");
   }
}