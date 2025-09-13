// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "All the best";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        
         char ch=str.charAt(i);
        char ch1= Character.toLowerCase(ch);
        
        if(String.valueOf(ch1).matches("[aeiou]"))
        {
            count++;
        }

        }
     String  s2= str.replaceAll("\\s+","");
        System.out.println("vowels=="+count);
        int len= s2.length()-count;
        
     System.out.println("consonats="+ len);

