import java.util.*;

class Main{
    public static void generateParnethesis(int n, ArrayList<String>result,int open, int close, StringBuilder sb){
        if(open==n && close==n){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            generateParnethesis(n,result,open+1,close,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            generateParnethesis(n,result,open,close+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args){
        int n=3;
        ArrayList<String>result=new ArrayList<>();
        generateParnethesis(n,result,0,0,new StringBuilder());
        System.out.println(result);
    }
}