import java.util.*;

public class Main {
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfN(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfN(n));
    }
}