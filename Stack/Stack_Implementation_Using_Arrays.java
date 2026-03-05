import java.util.*;

public class Main{
    static class stack{
       int[]arr=new int[5];
       int top=-1;

       public boolean isEmpty(){
           return top==-1;
       }
       public void push(int data){
           if(top==arr.length-1){
               System.out.println("Stack is OverFlow!");
               return;
           }
           top++;
           arr[top]=data;
       }
       public int pop(){
           if(isEmpty()){
               System.out.println("Stack is UnderFlow!");
               return -1;
           }
           int val=arr[top];
           top--;
           return val;
       }
       public int peek(){
           if(isEmpty()){
               System.out.println("Stack is Empty!");
               return -1;
           }
           return arr[top];
       }
    }
    public static void main(String[] args) {
        stack s=new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.pop();
        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}