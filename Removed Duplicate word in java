// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       
String str = "java sql java python java python";
StringBuilder sb=new StringBuilder();

String st[]=str.split("\\s+");

HashMap<String,Integer> map=new HashMap<>();

for(int i=0;i<st.length;i++)
{
    
    map.put(st[i],map.getOrDefault(st[i],0)+1);
}

for(int i=0;i<st.length;i++)
{
    
    if(map.get(st[i])>=1)
    {
        sb.append(st[i]);
        map.put(st[i],0);
        if(i!=st.length-1)
        {
            sb.append(" ");
        }
    }
}
System.out.println(sb);




    }
}
