import java.util.*;
class Main{
    public static String removeOuterParentheses(String s) {
        int n=s.length();
        int count=1;
        int x=1;
        String s1="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==1){
                s1+=s.substring(x,i);
                x=i+2;
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
}