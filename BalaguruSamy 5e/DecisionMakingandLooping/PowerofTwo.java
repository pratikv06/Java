/**
 * Program:
 * Computing the power of 2 using for loop
 */
class PowerofTwo{
   public static void main(String[] args) {
      long p= 1;
      int n;
      double q;
      System.out.println("2 to power -n \t\tn \t2 to power n");
      for(n= 0; n <10; ++n){
         if(n == 0)
            p++;
         else
            p *=2;
         q = 1.0/(double)p;
         System.out.println(q+ "\t\t\t" + n + "\t\t" + p);
      }
   }
}