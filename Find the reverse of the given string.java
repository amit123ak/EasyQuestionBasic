// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String s = "Welcome to java class";
    String rev="";
   for(int i=0;i<s.length();i++)
   {
       rev=rev+ s.charAt(s.length()-i-1);
   }
   System.out.print(rev);




    }
}
