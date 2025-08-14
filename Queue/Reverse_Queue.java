import java.util.*;

public class Main {
    public static void reverse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.print("Orignal Queue:");
        for(int num : q){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print("Reverse Queue:");
        reverse(q);
    }
}