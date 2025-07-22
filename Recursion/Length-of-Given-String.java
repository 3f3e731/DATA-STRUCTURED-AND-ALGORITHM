import java.util.*;

public class Main {
    public static int findLength(String str, int n){
        if(n==str.length()){
            return 0;
        }

        return 1+findLength(str,n+1);

    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(findLength(str,0));
    }
}