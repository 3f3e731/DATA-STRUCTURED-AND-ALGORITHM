import java.util.*;

public class Main {
    static class Queue {
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();

        //isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue empty!");
                return -1;
            }
            return s1.pop();
        }

        //Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue empty!");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}