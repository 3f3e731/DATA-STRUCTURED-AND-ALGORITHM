import java.util.*;

public class Main {
    public static void binaryString(String str,StringBuilder curr, int n){
        if(n==str.length()){
            System.out.println(curr);
            return;
        }
        curr.append(str.charAt(n));
        binaryString(str,curr,n+1);
        curr.deleteCharAt(curr.length()-1);
        binaryString(str,curr,n+1);
    }
    public static void main(String[] args){
        String str="abc";
        binaryString(str,new StringBuilder(),0);
    }
}