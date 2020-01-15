/**
 * Program:
 * An Example of dynameic method dispatch mechanism
 */
class Super{
   void display(){
      System.out.println("Method of Super class is called");
   }
}

class Sub extends Super{
   void display(){
      System.out.println("Method of Sub class is called");
   }
}

class DynamicDispatch{
   public static void main(String[] args) {
      Super obj = new Sub(); // Sub class object reference assigned super type reference variable
      obj.display(); // Sub class version of method will be called at runtime
   }
}