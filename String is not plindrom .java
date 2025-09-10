// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
//Check whether the given string is palindrome or not

    String s = "Welcome to java class";
    String rev="";
   for(int i=0;i<s.length();i++)
   {
       rev=rev+ s.charAt(s.length()-i-1);
   }
   if(rev.equals(s))
   {
       System.out.println("number is  prindrom");
   }else{
              System.out.println("number is not prindrom");

   }




    }
}
