import java.util.*;

public class A {
    public static void main(String[] args) {
        
        
        String str = "raining here...";
        int arr[]=new int [256];
        
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)]++;
        }
        
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)]>=1)
            {
                System.out.print(str.charAt(i));
                arr[str.charAt(i)]=0;
                
            }
        }
        
        
    }
}
