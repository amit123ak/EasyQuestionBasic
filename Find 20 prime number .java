// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");



// prime number 

 for(int n=1;n<=20;n++)
 {
 boolean IsPrime=true;
 
   if(n<1)
   {
       IsPrime=false;
   }else{
 
   for(int i=2;i<=Math.sqrt(n) ;i++)
   
   {
       if(n%i==0)
       
       {
           IsPrime=false;
           break;
           
       }
   }
   
   if(IsPrime==true)
   {
       System.out.println(n);
   }
   
   }
   
 }

    }
}
