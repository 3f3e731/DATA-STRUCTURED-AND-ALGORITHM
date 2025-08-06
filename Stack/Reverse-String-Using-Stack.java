import java.util.*;

public class Main{
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder ans=new StringBuilder();
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        str=ans.toString();
        return str;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverseString(str));

    }
}