import java.util.*;

public class Main {
    public static int StringToInteger(String s){
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int sign=1;
        int index=0;
        long result=0;

        if(s.charAt(index)=='-'){
            sign=-1;
            index++;
        }
        else if(s.charAt(index)=='+'){
            index++;
        }

        while(index<s.length() && Character.isDigit(s.charAt(index))){
            result=(result*10)+s.charAt(index)-'0';

            if(sign*result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int)(sign*result);
    }
    public static void main(String[] args) {
        String s1 ="-42";
        String s2="1337c0d3";
        System.out.println(StringToInteger(s1));
        System.out.println(StringToInteger(s2));
    }
}