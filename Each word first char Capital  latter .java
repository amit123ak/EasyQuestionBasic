// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        


//16.To Change each word's first letter to upper case:
    String str = "welcome to java class";
    String st[] =str.split("\\s+");
    StringBuilder sb=new StringBuilder();
    
    for(int i=0;i<st.length;i++)
    {
        String word=st[i];
        char ch= Character.toUpperCase(word.charAt(0));
            sb.append(ch);
        for(int j=1;j<word.length();j++)
        {
          sb.append(word.charAt(j));
        }
        if(i!=st.length-1)
        {
            sb.append(" ");
        }
        
    }
    
    System.out.println(sb);





    }
}
