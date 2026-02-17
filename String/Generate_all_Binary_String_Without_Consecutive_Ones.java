import java.io.*;
import java.util.*;

public class Main {
    public static void binaryString(int n, int lastValue, StringBuilder sb){
        if(n==0){
            System.out.println(sb.toString());
            return;
        }
        sb.append("0");
        binaryString(n-1,0,sb);
        sb.deleteCharAt(sb.length()-1);

        if(lastValue==0){
            sb.append('1');
            binaryString(n-1,1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args){
        int n=3;
        StringBuilder sb=new StringBuilder();
        binaryString(n,0,sb);
    }
}