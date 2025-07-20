import java.util.*;

public class Main {
    //Normal Recursion
    public static int power(int num, int n){
        if(n==0){
            return 1;
        }
        return num*power(num,n-1);
    }

    //Optimized
    public static int optimizedPower(int num, int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(num,n/2);

        int halfPowerSq=halfPower * halfPower;

        if(n%2!=0){
            halfPowerSq=num*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int num=2;
        int n=5;
        System.out.println(power(num,n));

        System.out.println(optimizedPower(num,n));
    }
}