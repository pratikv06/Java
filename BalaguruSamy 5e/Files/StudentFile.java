/**
 * Program:
 * Creating a file using text field in windows
 */

import java.io.*;
import java.awt.*;
class StudentFile extends Frame{
   // Defining Windows Components
   TextField number, name, marks;
   Button enter, done;
   Label numLabel, nameLabel, markLabel;
   DataOutputStream dos;

   // Initializze the frame
   public StudentFile(){
      super("Create Student File");
   }

   // setup the Window
   public void setup(){
      resize(400, 200);
      setLayout(new GridLayout(4, 2));

      // Creating the component of the frame
      number = new TextField(25);
      numLabel = new Label("Roll Number");

      name = new TextField(25);
      nameLabel = new Label("Student Name");

      marks = new TextField(25);
      markLabel = new Label("Marks");

      enter = new Button("ENTER");
      done = new Button("DONE");

      // Adding the component to the frame
      add(numLabel);
      add(number);
      add(nameLabel);
      add(name);
      add(markLabel);
      add(marks);
      add(enter);
      add(done);

      // Show Frame
      show();
      // open the file
      try {
         dos = new DataOutputStream(new FileOutputStream("student.dat"));
      } catch (IOException e) {
         //TODO: handle exception
         System.out.println(e);
      }
   }

   // Write to File
   public void addRecord(){
      int num;
      Double d;
      num = (new Integer(number.getText())).intValue();
      try {
         dos.writeInt(num);
         dos.writeUTF(name.getText());
         d = new Double(marks.getText());
         dos.writeDouble(d.doubleValue());
      } catch (Exception e) {
      }

      // Clear the text fields
      number.setText(" ");
      name.setText(" ");
      marks.setText(" ");
   }

   // Adding Record and claering the textField
   public void cleanUp(){
      if(! number.getText().equals(" ")){
         addRecord();
      }
      try {
         dos.flush();
         dos.close();
      } catch (Exception e) {
         //TODO: handle exception
      }
   }
   
   // Processing the event
   public boolean action(Event event, Object o){
      if(event.target instanceof Button){
         if(event.arg.equals("Enter")){
            addRecord();
            return true;
         }
      }
      return super.action(event, o);
   }

   public boolean handleEvent(Event event){
      if(event.target instanceof Button){
         if(event.arg.equals("DONE")){
            cleanUp();
            System.exit(0);
            return true;
         }
      }
      return super.handleEvent(event);
   }

   // Execution of program
   public static void main(String[] args) {
      StudentFile student = new StudentFile();
      student.setup();
   }
}