/**
 * Program:
 * THe FInd Host Application uses the InetAddress class to find information 
 * related to the hosts (Web addresses). The InetAddress classs uses Domain name
 * system (DNS) to determine the host inforamtion such as its IP address, host 
 * name, etc.
 * 
 * The various methods used in this progam:
 * 1. getByName(): Returns the IP address of the host
 * 2. getAllByName(): Returns all the IP addresses of the host
 * 3. getLocalHost(): Returns the name and IP addresses of the host
 * 
 * Objective:
 * 1. To find information about a host
 * 2. To demonstrate the functionality of the various functions of the InetAddress
 * class
 */

import java.util.*;
import java.net.*;

class FindHostApplication{
   public static void main(String[] args) {
      char choice;
      String str = "";
      Scanner input = new Scanner(System.in);

      while(true){
         System.out.println("Select your Choice: ");
         System.out.println("I -> Find IP Address for a given host name.");
         System.out.println("A -> Find all IP Address for a given host name.");
         System.out.println("L -> Find all Local host.");
         System.out.println("E -> Exit.");
         System.out.print("Enter Your Choice : ");
         System.out.flush();
         try {
            switch(choice = (char)System.in.read()){
               case 'I':
               case 'i':   System.out.print("Enter host name : ");
                           str = input.next();
                           try {
                              InetAddress addr = InetAddress.getByName(str);
                              System.out.println("IP Address of the site is " +addr);
                           } catch (UnknownHostException e) {
                              System.out.println("There is an exception : " +e.getMessage());
                           }
                           break;
               case 'A':
               case 'a':   System.out.print("Enter host name : ");
                           str = input.next();
                           try {
                              InetAddress[] addr = InetAddress.getAllByName(str);
                              System.out.println("IP Address of all site is :");
                              for(int i = 0; i < addr.length; i++){
                                 System.out.println(addr[i]);
                              }
                           } catch (UnknownHostException e) {
                              System.out.println("There is an exception : " +e.getMessage());
                           }
                           break;
               case 'L':
               case 'l':   try {
                              InetAddress name = InetAddress.getLocalHost();
                              System.out.println("LocalHost Name : " +name.toString());   
                           } catch (UnknownHostException e) {
                              System.out.println("There is an exception : " + e.getMessage());
                           }
                           break;
               case 'E':
               case 'e':   System.exit(0);
               defaault:   System.out.println("Invalid Choice...");
            }
         } catch (Exception e) {
            System.out.println("I/O Error");
         }
      }
   }
}