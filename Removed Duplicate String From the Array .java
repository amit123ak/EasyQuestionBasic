// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       
String str = "java sql java python java python";
StringBuilder sb=new StringBuilder();

LinkedHashSet<String> set=new LinkedHashSet<String>();

String st[]=str.split("\\s+");


for(int i=0;i<st.length;i++)
{
    set.add(st[i]);
}

int count=0;
for(String s:set)

{
    sb.append(s);
    count++;
    
    if(count<set.size())
    {
        sb.append(" ");
    }
}

System.out.println(sb);




    }
}
