/** NOT WORKING
 * Program:
 * Using the methods of the Linked List Class
 */

import java.util.*;

class Car{
   String car1, car2, car3, car4;
   Car(){
      car1 = "Benz";
      car2 = "Toyoto";
      car3 = "Qualis";
      car4 = "Santro";
   }
}

class Bird{
   String bird1, bird2, bird3, bird4;
   Bird(){
      bird1 = "Parrot";
      bird2 = "Duck";
      bird3 = "Raven";
      bird4 = "Sparrow";
   }
}

public class LinkedListExample{
   private LinkedList list = new LinkedList();

   public void push1(Object o){
      list.addFirst(o); // add element to the first pisotion of the list
   }

   public void push2(Object o){
      list.addLast(o); // add element at last of the list
   }

   public Object pop(){
      return list.getFirst(); // get element from First of the list (Not Removed)
   }

   public Object bottom(){
      return list.getLast(); // get element from last of the list (Not Removed)
   }

   public static void main(String[] args) {
      Car myCar;
      Bird myBird;
      LinkedListExample s = new LinkedListExample();
      s.push1(new Car());
      s.push2(new Bird());
      System.out.println(s.list);
      
      myCar = (Car)s.pop();
      System.out.println("The First element in the list is - " +myCar);

      myBird = (Bird)s.bottom();
      System.out.println("The last element in the list is - " +myBird);
   }
}