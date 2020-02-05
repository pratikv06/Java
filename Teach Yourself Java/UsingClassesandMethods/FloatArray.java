/**
 * Program:
 * Create ana rray with five float argument and,
 * display the length of the array and its elements
 */

class FloatArray{
   public static void main(String[] args) {
      Float arr[] = new Float[5];

      arr[0] = 32.43f;
      arr[1] = 42.3f;
      arr[2] = 86.3f;
      arr[3] = 100f;
      arr[4] = 123.43234f;

      System.out.println("Length of the array : "+ arr.length);
      System.out.println("arr[0] = "+ arr[0]);
      System.out.println("arr[1] = "+ arr[1]);
      System.out.println("arr[2] = "+ arr[2]);
      System.out.println("arr[3] = "+ arr[3]);
      System.out.println("arr[4] = "+ arr[4]);

   }
}