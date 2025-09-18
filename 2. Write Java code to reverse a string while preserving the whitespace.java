// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      
              String input = "I am QA Engineer";
             char ch[]= input.toCharArray();
             char st[]=new char[ch.length];
             for(int i=0;i<ch.length;i++)
             {
                 if(ch[i]==' ')
                 {
                     st[i]=' ';
                 }
             }
             int j=st.length-1;
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]!=' ')
                {
                    while(st[j]==' ')
                    {
                        j--;
                    }
                     st[j]=ch[i];
                     j--;
                }
               
            }
            
           System.out.println(String.valueOf(st));
             
             
             
    }
}
