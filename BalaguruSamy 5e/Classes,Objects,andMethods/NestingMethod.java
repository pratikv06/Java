/**
 * Program:
 * Nesting of Methods
 * 
 * NOTE:
 * A method can be called by using its name only by another method of the same class
 */
class Nesting{
   int m,n;
   
   Nesting(int x, int y){
      m=x;
      n=y;
   }

   int largest(){
      if(m>=n){
         return m;
      }
      else{
         return n;
      }
   }

   void display(){
      int large = largest(); // Calling a method using its name only
      System.out.println("Largest value is: " +large);
   }

}

 class NestingMethod{
    public static void main(String[] args) {
       Nesting nest = new Nesting(50, 40);
       nest.display();
    }
 }