import java.util.*;

public class Main{
    public static void insert(Stack<Integer>s, int top){
        if(s.isEmpty() || s.peek()<=top){
            s.push(top);
            return;
        }
        int val=s.pop();
        insert(s,top);
        s.push(val);
    }
    public static void sortStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        sortStack(s);
        insert(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(4);
        s.push(55);
        s.push(2);
        s.push(47);
        s.push(28);

        sortStack(s);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}