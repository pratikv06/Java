class CastingVariable {
   public static void main (String args[]){
      System.out.println(":: Variables Created ::");
      char c = 'x';
      byte b = 50;
      short s = 1998;
      int i = 123456789;
      long l = 1234567654321L;
      float f1 = 3.142F;
      float f2 = 1.23e-5F;
      double d = 0.000000987;
      System.out.println("c = " + c);
      System.out.println("b = " + b);
      System.out.println("s = " + s);
      System.out.println("i = " + i);
      System.out.println("l = " + l);
      System.out.println("f1 = " + f1);
      System.out.println("f2 = " + f2);
      System.out.println("d = " + d);
      System.out.println( );
      
      System.out.println("Types Converted");
      short s1 = (short)b;
      short s2 = (short)i;
      float n1 = (float)l;
      int m1 = (int)f1;
      
      System.out.println("(short)b = " + s1);
      System.out.println("(short)i = " + s2);
      System.out.println("(float)l = " + n1);
      System.out.println("(int)f1 = " + m1);
   }
}