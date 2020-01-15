/**
 * Program:
 * Illustration of method overridding
 */
class Super{
   int x;

   Super(int x){
      this.x = x;
   }

   void display(){   // Method Display
      System.out.println("Super x: " + x);
   }
}

class Subclass extends Super{
   int y;

   Subclass(int x, int y){
      super(x);
      this.y = y;
   }

   void display(){   // Again method display
      System.out.println("Super x: " +x +"\nSub y: " +y);
   }
}

 class MethodOverRidding{
    public static void main(String[] args) {
       Subclass obj = new Subclass(100, 200);
       obj.display();
    }
 }