/**
 * Program:
 * Illustrate that multiple variables can reference a single object,
 * also a variable may refer to one object and later refer to a different object
 */

class MultipleObjects{
   public static void main(String[] args) {
      Integer obj1 = new Integer(5);
      Integer obj2 = obj1;
      Integer obj3 = obj1;
      System.out.println(obj1 +"\t"+ obj2 +"\t"+ obj3);

      obj1 = 100;
      System.out.println(obj1 +"\t"+ obj2 +"\t"+ obj3);

      Integer obj = new Integer(6);
      System.out.println(obj);
      obj = new Integer(10);
      System.out.println(obj);
      obj = new Integer(1012);
      System.out.println(obj);
      
   }
}