/**
 * Program:
 * read tha data stored in "student.dat" file by StudentFile.java Program 
 */

import java.io.*;
import java.awt.*;

class ReadStudentFile extends Frame{
   // Defining windows Component
   TextField number, name, marks;
   Button next, done;
   Label numLabel, nameLabel, markLabel;
   DataInputStream dis;
   boolean moreRecords = true;

   // Initialize the frame
   public ReadStudentFile(){
      super("Read Student File");
   }

   // Setup the Windows
   public void setup(){
      resize(400, 200);
      setLayout(new GridLayout(4, 2));

      // Create the Component of the frame
      number = new TextField(25);
      numLabel = new Label("Roll Number");

      name = new TextField(25);
      nameLabel = new Label("Student Name");

      marks = new TextField(25);
      markLabel = new Label("Marks");

      next = new Button("NEXT");
      done = new Button("DONE");

      // Add the COmponent to the frame
      add(numLabel);
      add(number);
      add(nameLabel);
      add(name);
      add(markLabel);
      add(marks);
      add(next);
      add(done);

      // Show frame
      show();
      try {
         dis = new DataInputStream(new FileInputStream("student.dat"));
      } catch (IOException e) {
         //TODO: handle exception
         System.err.println(e.toString());
         System.exit(1);
      }
   }

   // Read from the file
   public void readRecord(){
      int n;
      String s;
      double d;
      try {
         n = dis.readInt();
         s = dis.readUTF();
         d = dis.readDouble();
         number.setText(String.valueOf(n));
         name.setText(String.valueOf(s));
         marks.setText(String.valueOf(d));
      } catch (EOFException e) {
         //TODO: handle exception
         moreRecords = false;
      } catch(IOException e){
         System.out.println(e);
         System.exit(1);
      }
   }

   // Closing the input file
   public void cleanup(){
      try {
         dis.close();
      } catch (IOException e) {      }
   }

   // Processing the event
   public boolean action(Event event, Object o){
      if(event.target instanceof Button){
         if(event.arg.equals("NEXT")){
            readRecord();
         }
      }
      return true;
   }

   public boolean handleEvent(Event event){
      if(event.target instanceof Button){
         if(event.arg.equals("DONE") || moreRecords == false){
            cleanup();
            System.exit(0);
            return true;
         }
      }
      return super.handleEvent(event);
   }

   // Execute the Program
   public static void main(String[] args) {
      ReadStudentFile student = new ReadStudentFile();
      student.setup();
   }

}