class ArithematicOperationPrecedence {
   public static void main(String args[]){
      int a= 9, b= 12, c= 3;
      System.out.print("Expression 1 : a-b/3 + c*2-1");
      System.out.println(" >> "+ (a-b/3 + c*2-1));
      System.out.print("Expression 2 : a-b / (3+c) * (2-1)");
      System.out.println(" >> "+ (a-b / (3+c) * (2-1)));
      System.out.print("Expression 3 : a - (b/ (3+c) *2) - 1");
      System.out.println(" >> "+ (a-(b/(3+c)*2)-1));
      System.out.print("Expression 4 : a - (( b / 3) + c * 2) - 1)");
      System.out.println(" >> "+ (a-((b / 3)+c * 2)-1));

   }
}

/**
 * Note
 * Number Step to Solve a Arithematic Operation == Number of Operator in Equation,
 * Parenthese allow to change the order of priority,
 * 
 */