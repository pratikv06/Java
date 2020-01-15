/**
 * Program:
 * add two elements from the collection< stack without using 
 * autoboxing and unboxing 
 */

import java.util.Stack;
class AutoUnboxing{
   public static void main(String[] args) {
      System.out.println("--- Without Using Autoboxing and Unboxing ---");
      Stack myStack = new Stack();
      
      myStack.push(new Integer(10));
      myStack.push(new Integer(20));
      
      Integer int1 = (Integer)myStack.pop();
      Integer int2 = (Integer)myStack.pop();
      
      int sum = int1.intValue() + int2.intValue();
      System.out.println("Sum is: " +sum); 


      System.out.println("--- Using Autoboxing and Unboxing ---");
      Stack<Integer> newStack = new Stack<Integer>();

      newStack.push(10); //autoboxing
      newStack.push(20); //autoboxing

      int pop1 = newStack.pop();  // unboxing
      int pop2 = newStack.pop(); // unboxing
      sum = pop1 + pop2 ;
      System.out.println("Top Element in Stack: "+ pop1);
      System.out.println("Next Element in Stack: " +pop2);
      System.out.println("Sum of above two value is: " +sum);
   }
}