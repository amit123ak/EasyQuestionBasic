// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       // int n=10;

     int num = 153; 
    //.To find the sum of the digits in a given number:



       int rev=0;
       int temp=num;
       int sum=0;
       while(temp>0)
       {
          int r=temp%10;
          sum=sum+r;
           temp=temp/10;
           
       }
   System.out.println(sum);
    }
}
