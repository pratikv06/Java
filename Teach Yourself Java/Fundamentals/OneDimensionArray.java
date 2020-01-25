/**
 * Program:
 * Following program creates and initializes a one-dimensional array 
 * of four element 
 */

class OneDimensionArray{
   public static void main(String[] args) {
      // Declare and allocate space
      int myarray[] = new int[4];

      // Initialize elements
      myarray[0] = 33;
      myarray[1] = 71;
      myarray[2] = -16;
      myarray[3] = 45;

      // Display length;
      System.out.println("myarray.length = "+ myarray.length);

      // Display elements
      System.out.println(myarray[0] +"\n"+ myarray[1] +"\n"+ myarray[2] +"\n"+ myarray[3]);
   }
}