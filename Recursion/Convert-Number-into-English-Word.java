import java.util.*;

public class Main {
    public static void convertToWord(int num){
        String[]words={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(num==0){
            return;
        }
        convertToWord(num/10);
        int digit=num%10;
        System.out.print(words[digit]+" ");
    }
    public static void main(String[] args) {
        int num=2019;
        convertToWord(num);
    }
}