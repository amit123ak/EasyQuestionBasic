// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
         String s = "goodday";
         
         // sort the char ;
         
        char ch[]= s.toCharArray();
        
   Arrays.sort(ch);
   
   StringBuilder sb=new StringBuilder();
   
   for(int i=0;i<ch.length;i++)
   {
      sb.append(ch[i]);
   }
   System.out.println(sb);
        


       



      

    }
}
