import java.util.*;
class Main{
    public static void generateBinary(int n, ArrayList<String>res, StringBuilder sb){
        if(n==0){
            res.add(sb.toString());
            return;
        }
        sb.append('0');
        generateBinary(n-1,res,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append('1');
        generateBinary(n-1,res,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<String>res=new ArrayList<String>();
        generateBinary(n,res,new StringBuilder());
        System.out.println(res);
    }
}