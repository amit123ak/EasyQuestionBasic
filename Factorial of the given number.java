// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       // int n=10;

    // 12.Factorial of the given number:
    
    // 0,1,1,2,3,5,8 
    
    int a=0;
    int b=1;
    System.out.print(a+" ");
    System.out.print(b+" ");
    for(int i=0;i<=5;i++)
    {
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }


    }
}
