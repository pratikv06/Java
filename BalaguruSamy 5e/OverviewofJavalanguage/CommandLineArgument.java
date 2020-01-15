class CommandLineArgument{
   public static void main(String args[]){
      int count, i=0;
      String value;
      count = args.length;
      System.out.println("Number of Arguments = " + count);
      while(i < count){
         value = args[i];
         i++;
         System.out.println(i+ " : Java is " + value + "!");
      }
   }
}

// Input Values
// Simple "Object Oriented" Distributed Robust Secure Portable MultiThreaded Dynamic