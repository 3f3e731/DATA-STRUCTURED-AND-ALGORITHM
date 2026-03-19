import java.util.*;

class Main{
    public static void PowerSet(String str, int i, ArrayList<String>result,StringBuilder sb){
        if(i==str.length()){
            result.add(sb.toString());
            return;
        }
        sb.append(str.charAt(i));
        PowerSet(str,i+1,result,sb);
        sb.deleteCharAt(sb.length()-1);
        PowerSet(str,i+1,result,sb);
    }
    public static void main(String[] args){
        String str="abc";
        ArrayList<String>result=new ArrayList<>();
        PowerSet(str,0,result,new StringBuilder());
        System.out.println(result);
    }
}