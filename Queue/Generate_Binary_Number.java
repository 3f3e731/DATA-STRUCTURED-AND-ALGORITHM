import java.util.*;

public class Main {
    public static void generateBinary(int N){
        System.out.print("Binary Function:");
        for(int i=1;i<=N;i++){
            System.out.print(Integer.toBinaryString(i)+" ");
        }
        System.out.println();
    }
    
    //Queue
    public static void generateBinaryQueue(int N){
        Queue<String>q=new LinkedList<>();
        q.add("1");
        System.out.print("Queue Based:");
        for(int i=0;i<N;i++){
            String s=q.poll();
            System.out.print(s+" ");

            q.add(s+"0");
            q.add(s+"1");
        }
    }
    public static void main(String[] args) {
        int N=5;
        generateBinary(N);

        generateBinaryQueue(N);
    }
}