import java.util.*;

public class Main {
    public static void oddOrEven(int num){
        int bitmass=1;
        if((num & bitmass)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
    }
}