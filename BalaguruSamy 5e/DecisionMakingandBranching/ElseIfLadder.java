/**
 * Program :
 * Grading the students in an academic Institute
 * using if ELse Ladder
 */
class ElseIfLadder{
   public static void main(String[] args) {
      int rollNumber[] = {111, 222, 333, 444};
      int marks[] = {81, 75, 43, 58};
      for(int i=0; i<rollNumber.length; i++){
         if(marks[i] > 75)
            System.out.println(rollNumber[i] + " Honors");
         else if(marks[i] > 59)
            System.out.println(rollNumber[i] + " I Division");
         else if(marks[i]>49)
            System.out.println(rollNumber[i] + " II Division ");
         else  
            System.out.println(rollNumber[i] + " FAIL");
      }
   }
}