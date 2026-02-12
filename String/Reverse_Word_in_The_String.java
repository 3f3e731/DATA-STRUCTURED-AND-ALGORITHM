import java.util.*;
class Main{
    public static String reverseWords(String s) {
        String[]str=s.trim().split("\\s+");
        int n=str.length;
        String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=str[i];
            if(i!=0){
                ans+=" ";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }
}