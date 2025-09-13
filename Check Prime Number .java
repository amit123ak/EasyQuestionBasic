// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        //  30.To check the given number is prime or not:
        
        
        int n=23;
        boolean isPrime=true;
        if(n==0|| n==1)
        {
            System.out.println("Not prime Number");
            return;
        }else{
            
            
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
    System.out.println("prime number");
        }else{
            System.out.println("Is Not a prime number");
        }

                 
  

         
   


      

    }
}
