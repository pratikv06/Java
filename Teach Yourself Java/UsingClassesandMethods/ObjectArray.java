/**
 * Program:
 * Create an array to store five objects that are of class
 * Integer, String, Boolean, Character, and Double.
 * Display the elements
 */

class ObjectArray{
   public static void main(String[] args) {
      Object arr[] = new Object[5];

      arr[0] = new Integer(12);
      arr[1] = new String("name");
      arr[2] = new Boolean(true);
      arr[3] = new Character('A');
      arr[4] = new Double(12.34);

      System.out.println("Length of the array is "+ arr.length);
      System.out.println("arr[0] = " +arr[0] +" : Type - "+ arr[0].getClass().getSimpleName());
      System.out.println("arr[1] = " +arr[1] +" : Type - "+ arr[1].getClass().getSimpleName());
      System.out.println("arr[2] = " +arr[2] +" : Type - "+ arr[2].getClass().getSimpleName());
      System.out.println("arr[3] = " +arr[3] +" : Type - "+ arr[3].getClass().getSimpleName());
      System.out.println("arr[4] = " +arr[4] +" : Type - "+ arr[4].getClass().getSimpleName());

   }
}