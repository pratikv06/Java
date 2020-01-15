class TypeCasting{
   public static void main (String args[]){
      float sum=0.0F;
      int i;
      for(i=1; i<=10; i++){
         sum += 1/(float)i;
         System.out.print("i = " + i);
         System.out.println("\tsum = " + sum);
      }
   }
}