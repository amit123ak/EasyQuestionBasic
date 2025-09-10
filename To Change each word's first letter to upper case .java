// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
// reverse the word from the string 
//15.To find the reverse of each word:

 String str = "Welcome to java class";
//To Change each word's first letter to upper case:
String st[]=str.split("\\s+");

 StringBuilder sb=new StringBuilder();
 
 for(int i=0;i<st.length;i++)
 {
    String first=st[i];
   char ch= first.charAt(0);
   String pp=""+ch;
     pp=pp.toUpperCase();
   
   
      for(int j=1;j<first.length();j++)
      {
          pp+=first.charAt(j);
          
      }
      sb.append(pp);
      if(st.length!=i)
      {
          sb.append(" ");
      }
    
     
 }

System.out.println(sb);







    }
}
