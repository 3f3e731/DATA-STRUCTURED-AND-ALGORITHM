import java.util.*;

class Main{
    public static int pred(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='/' || ch=='*'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Stack<Character>s=new Stack<>();
        StringBuilder res=new StringBuilder();
        String str="(a-b/c)*(a/k-l)";

        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                s.push(ch);
            }
            else if(ch==')'){
                while(s.peek()!='('){
                    res.append(s.pop());
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && pred(ch)<=pred(s.peek())){
                    res.append(s.pop());
                }
                s.push(ch);
            }
        }

        System.out.println(res);
    }
}