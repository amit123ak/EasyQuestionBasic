// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
// reverse the word from the string 
//15.To find the reverse of each word:

 String str = "Welcome to java class";
 String st[]=str.split("\\s+");
 StringBuilder sb=new StringBuilder();
 
 for(int i=0;i<st.length;i++)
 {
     sb.append(st[st.length-i-1]);
     if(i!=st.length-1)
     {
         sb.append(" ");
     }
     
 }

System.out.println(sb);







    }
}
