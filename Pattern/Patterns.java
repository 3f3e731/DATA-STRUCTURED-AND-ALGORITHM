import java.util.*;
public class Main {
    public static void pattern1(int n){
        /*
         ****
         ****
         ****
         ****
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        /*
         *
         **
         ***
         ****
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        /*
         1
         12
         123
         1234
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        /*
         1
         22
         333
         4444
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        /*
         ****
         ***
         **
         *
         */
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        /*
         1234
         123
         12
         1
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        /*
         *
        ***
       *****
      *******
         */
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void pattern8(int n){
        /*
         *******
          *****
           ***
            *
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print("*");
            }
            for(int l=i;l<n-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        /*
         *
        ***
       *****
      *******
      *******
       *****
        ***
         *
         */
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print("*");
            }
            for(int l=i;l<n-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        /*
         *
         **
         ***
         ****
         ***
         **
         *
         */
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int k=i;k<n-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        /*
          1
          01
          101
          0101
         */
        for(int i=0;i<n;i++){
            for(int j=i+1;j>=1;j--){
                String ans=j%2==0?"0":"1";
                System.out.print(ans);
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        /*
          1
          23
          456
          78910
        */
        int inc=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(inc++);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        /*
         A
         AB
         ABC
         ABCD
        */
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        /*
         ABCD
         ABC
         AB
         A
        */
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=n;j>i;j--){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        /*
         A
         BB
         CCC
         DDDD
        */
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    public static void pattern16(int n){
        /*
         A
        ABA
       ABCBA
      ABCDCBA
         */
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int k=0;k<=i;k++){
                System.out.print(ch++);
            }
            ch--;
            for(int l=0;l<i;l++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        /*
        D
        CD
        BCD
        ABCD
        */
        for(int i=0;i<n;i++){
            char ch=(char)('A'+(n-1-i));
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
    }
}

