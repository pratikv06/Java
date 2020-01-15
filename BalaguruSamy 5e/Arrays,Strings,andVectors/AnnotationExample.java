/**
 * Program:
 * Use of Annotation
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
   int value(); // This variable name must be value
}

public class AnnotationExample{
   // Annotation a method using a marker
   @MySingle(100)
   public static void myMeth(){
      AnnotationExample obj = new AnnotationExample();
      try{
         Method m = obj.getClass().getMethod("myMeth");
         MySingle anno = m.getAnnotation(MySingle.class);
         System.out.println("The value is: " + anno.value()); // display 100
      }
      catch(NoSuchMethodException e){
         System.out.println("Method Not Found.");
      }
   }

   public static void main(String[] args) {
      myMeth();
   }
}