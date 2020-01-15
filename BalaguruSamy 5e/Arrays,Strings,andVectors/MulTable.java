/**
 * Program:
 * Application of Two-dimensional arrays
 */
class MulTable{
   final static int ROWS = 10;
   final static int COLUMNS = 10;
   public static void main(String[] args) {
      int product[][] = new int[ROWS][COLUMNS];
      System.out.println("Multiplication Table:\n");
      for(int i = 0; i<ROWS; i++){
         for(int j= 0; j<COLUMNS; j++){
            product[i][j] = (i+1)*(j+1);
            System.out.print(product[i][j] +"  "); 
         }
         System.out.println();
      }
   }
}