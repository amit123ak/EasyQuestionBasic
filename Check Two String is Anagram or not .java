// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
                String s1 = "adbc";

                 String s2 = "dbca";
                 
                 if(s1.length()!=s2.length())
                 {
                     System.out.println("both string are not anagram");
                 }
             char ch1[]=s1.toCharArray();
             char ch2[]=s2.toCharArray();
             Arrays.sort(ch1);
             Arrays.sort(ch2);
             
             String s3= String.valueOf(ch1);
             String s4=String.valueOf(ch2);
             if(s3.equals(s4))
             {
                 System.out.println("String is  Anagram");
             }else{
                 System.out.println("String is not anagram");
             }
             
                 
  

         
   


      

    }
}
