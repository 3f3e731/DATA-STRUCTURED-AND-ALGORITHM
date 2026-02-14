import java.util.*;
class Main{
    public static boolean rotateString(String s,String goal) {
        int str=s.length();
        for(int i=0;i<str;i++){
            String roStr=s.substring(i)+s.substring(0,i);

            if(roStr.equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static boolean rotateString2(String s, String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s="abcde",goal="cdeab";
        System.out.println(rotateString(s,goal));
        System.out.println(rotateString2(s,goal));
    }
}