import java.util.Stack;

public class infix {
    static int prec(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*'||c=='/'){
            return 2;
        }else if(c=='-'||c=='+'){
            return 1;
        }
        return -1;
    }
    static String infixtopostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }else{
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixtopostfix(str));
    }
}