/**
 * Program - Find the Largest from the Given three number
 */
class LargestofThree{
   public static void main(String[] args) {
      int a= 325, b= 712, c= 478;
      System.out.print("Largest Value is : ");
      if(a>b){
         if(a>c){
            System.out.println(a);
         }
         else{
            System.out.println(c);
         }
      }
      else{
         if(a>b){
            System.out.println(a);
         }
         else{
            System.out.println(b);
         }
      }
   }
}