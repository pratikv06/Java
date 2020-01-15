/**
 * Program:
 * Sorting a list of number
 */

class NumberSorting{
   public static void main(String[] args) {
      int number[] = {55, 40, 50, 80, 65, 71};
      int size = number.length;
      System.out.print("Given Array Value is : ");
      for(int i = 0; i<size; i++){
         System.out.print(number[i]+ " ");
      }
      System.out.print("\nSorted List: ");
      
      // Sorting Begin Descending Order 
      for(int i = 0; i<size; i++){
         for(int j =i+1; j<size; j++){
            if(number[i] < number[j]){
               // Interchanging value
               int temp = number[i];
               number[i] = number[j];
               number[j] = temp;
            }
         }
      } // Sorting Ends
      System.out.print("\nDescending Order: ");
      for(int i = 0; i<size; i++) {
         System.out.print(number[i]+ " ");
      }

      // Sorting Begin Ascending Order 
      for(int i = 0; i<size; i++){
         for(int j =i+1; j<size; j++){
            if(number[i] > number[j]){
               // Interchanging value
               int temp = number[i];
               number[i] = number[j];
               number[j] = temp;
            }
         }
      } // Sorting Ends
      System.out.print("\nAscending Order: ");
      for(int i = 0; i<size; i++) {
         System.out.print(number[i]+ " ");
      }
   }
}