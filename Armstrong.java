// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       // int n=10;

     int num = 153;


       int rev=0;
       int temp=num;
       while(temp>0)
       {
          int r=temp%10;
           rev =rev+r*r*r;
           temp=temp/10;
           
       }
    if(num==rev)
    {
        System.out.println("is Armstrong!");
    }else{
        System.out.println("is NOT Armstrong!");
    }
    }
}
