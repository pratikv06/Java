/**
 * Program :
 * Grading the students in an academic Institute
 * using if Switch Case Statement
 */
class SwitchStatement{
   public static void main(String[] args) {
      int rollNumber[] = {111, 222, 333, 444};
      int marks[] = {81, 75, 43, 58};
      for(int i=0; i<rollNumber.length; i++){
         int index = marks[i]/10;
         String grade;
         switch(index){
            case 10:
            case 9:
            case 8:  grade = "Honours"; break;
            case 7:  grade = "First Division"; break;
            case 6:  grade = "I Division"; break;
            case 5:  grade = "II Division"; break;
            default: grade = "FAIL";
         }
         System.out.println(rollNumber[i] + " " + grade);
      }
   }
}