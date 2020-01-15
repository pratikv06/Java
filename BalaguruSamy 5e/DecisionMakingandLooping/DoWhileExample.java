/**
 * Program :
 * Displaying Multiplication Tables
 */
class DoWhileExample{
   public static void main(String[] args) {
      int row, column, y;
      System.out.println("Multiplication Table...");
      row= 1;
      do{
         column=1;
         do{
            y= row*column;
            System.out.print(y + "\t");
            column++;
         }while(column<=10);
         System.out.println();
         row++;
      }while(row<=10);
   }
}