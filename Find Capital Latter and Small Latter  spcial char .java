// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       String str = "RenuDev1235@gmail.com";
       int ca=0;
       String cap="";
       int sm=0;
       String small="";
       int di=0;
       String digit="";
       int sp=0;
       String special="";
       
       for(int i=0;i<str.length();i++)
       {
           char ch= str.charAt(i);
           if(Character.isUpperCase(ch))
           {
               ca++;
               cap+=ch;
           }else if(Character.isLowerCase(ch))
           {
               sm++;
               small+=ch;
           }else if(Character.isDigit(ch))
           {
               di++;
               digit+=ch;
           }else{
               sp++;
               special+=ch;
                
           }
       }
       
       System.out.println(cap+"=="+ca);
       System.out.println(small+"=="+sm);
        System.out.println(digit+"=="+di);
        System.out.println(special+"=="+sp);



       



      

    }
}
