class JavaExpression{
   public static void main(String args[]){
      // Declaration and Initalizaion
      int a= 10, b= 5, c=8, d= 2;
      float x= 6.4F, y=3.0F;

      // Order of Evaluation
      int answer1 = a*b + c/d;
      int answer2 = a * (b+c) / d;
      System.out.println("** Order of Evaluation **");
      System.out.println("a*b + c/d = " + answer1);
      System.out.println("a * (b+c) / d = " + answer2);

      // Type Conversions
      float answer3 = a/c;
      float answer4 = (float) a/c;
      float answer5 = a/y;
      System.out.println("** Type Conversions **");
      System.out.println("a/c = "+ answer3);
      System.out.println("(float) a/c = " + answer4);
      System.out.println("a/y = " + answer5);
      // Modulo Operations
      int answer6 = a%c;
      float answer7 = x%y;
      System.out.println("** Modulo Operations **");
      System.out.println("a%c = " + answer6);
      System.out.println("x%y = " + answer7);
      // Logic Operations
      boolean bool1 = a>b && c>d;
      boolean bool2 = a<b && c>d;
      boolean bool3 = a<b || c>d;
      boolean bool4 = !(a-b == c);
      System.out.println("** Logic Operations **");
      System.out.println("a>b && c>d = " + bool1);
      System.out.println("a<b && c>d = " + bool2);
      System.out.println("a<b || c>d = " + bool3);
      System.out.println("!(a-b == c) = " + bool4);
   }
}