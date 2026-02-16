import java.util.*;
class Main{
    public static String removeDuplicate(String str, int i, StringBuilder sb){
        if(i==str.length()){
            return sb.toString();
        }
        if(sb.indexOf(String.valueOf(str.charAt(i)))==-1){
            return removeDuplicate(str,i+1,sb.append(str.charAt(i)));
        }
        else{
            return removeDuplicate(str,i+1,sb);
        }
    }
    public static String removeDuplicateOptimized(String str){
        int n=str.length();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
        }
        String ans="";
        for(char ch:map.keySet()){
            ans+=ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        StringBuilder sb=new StringBuilder();

        System.out.println(removeDuplicate(str,0,sb));
        System.out.println(removeDuplicateOptimized(str));
    }
}