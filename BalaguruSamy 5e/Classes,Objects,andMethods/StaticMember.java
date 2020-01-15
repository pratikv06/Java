/**
 * Program:
 * Defining and using static member
 * 
 * 
 * NOTE:
 * Static Keyword-
 *    1. Define a member that is common to all the objects and accessed without using
 *       a particular object - Use Static keyword
 *    2. Static variable are used when we want to have a variable common to all the
 *       instances of a class
 *    3. Static variable and static method can be called without using the object 
 * 
 * Restriction-
 *    1. They can only call other "static" methods
 *    2. They can only access "static" data
 *    3. They cannot refer to "this" or "super" in any way
 */

class MathOperation{
   static float mul(float x, float y){
      return x*y;
   }

   static float div(float x, float y){
      return x/y;
   }
}

 class StaticMember{
    public static void main(String[] args) {
       float a = MathOperation.mul(4.0F, 5.0F);
       float b = MathOperation.div(a, 2.0F);
       System.out.println("Answer is: " +b);
    }
 }