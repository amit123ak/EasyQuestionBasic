// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
         String s = "goodday";
         
         // sort the char ;
         StringBuilder sb=new StringBuilder();
 char ch[]= s.toCharArray();
 
 for(int i=0;i<ch.length;i++)
 {
     for(int j=i+1;j<ch.length;j++)
     {
          if(ch[i]>ch[j])
          {
         char temp= ch[i];
         ch[i]=ch[j];
         ch[j]=temp;
          }
     }
 }
 
 for(int i=0;i<ch.length;i++)
 {
     sb.append(ch[i]);
 }
 
 System.out.println(sb);
       



      

    }
}
