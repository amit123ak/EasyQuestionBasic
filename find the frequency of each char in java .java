// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
         String s = "raining her...";


       
       LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
       
       for(int i=0;i<s.length();i++)
       {
          char ch= s.charAt(i);
          
          map.put(ch,map.getOrDefault(ch,0)+1);
       }
       
     System.out.println(map);



    }
}
