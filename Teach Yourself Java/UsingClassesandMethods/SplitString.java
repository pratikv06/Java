/**
 * Program:
 * A string contain 5 number seperated by commas,
 * write a program to display last number
 */

class SplitString{
   public static void main(String[] args) {
      String num = "123,2134,543,65,2345";
      String[] arr = num.split(",");
      int size = arr.length;
      System.out.println(arr[size-1]);
   }
}