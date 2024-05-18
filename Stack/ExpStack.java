import java.util.Stack;
public class ExpStack{
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        String a="44*2+3*6";
        int num=0;
        char sign='+';
        for(int i=0;i<a.length();i++)
        {
            char c =a.charAt(i);
            if(Character.isDigit(c))
            {
             num=num*10+(a.charAt(i)-'0');
            }
            if(!Character.isDigit(c) && c!=' '||i==a.length()-1)
            {
                if(sign == '+')
                    s.push(num);
                else if(sign=='-')
                    s.push(-num);
                else if(sign=='*')
                    s.push(s.pop()*num);
                else if(sign=='/')
                    s.push(s.pop()/num);
                    sign=c;
                    num=0;
            }
        }
        int result=0;
        while(!s.isEmpty())
        {
            result+=s.pop();
    }
    System.out.println(result);
}
}