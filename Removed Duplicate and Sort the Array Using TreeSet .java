// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       
    int[] a = { 55, 39, 26, 78, 55, 99, 30 };
    
    TreeSet<Integer>set=new TreeSet<>();
    
    for(int i=0;i<a.length;i++)
    {
        set.add(a[i]);
    }
    
    System.out.print(set);
        System.out.print("\n");

    
    for(Integer p
    :set)
    {
        System.out.println(p +" ");
    }





    }
}
