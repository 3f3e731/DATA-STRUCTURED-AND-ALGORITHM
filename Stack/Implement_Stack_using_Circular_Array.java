import java.util.*;
public class Main{
    static class Stack{
        int[]arr;
        int top;
        int size;
        int capacity;
        
        Stack(int capacity){
            this.capacity=capacity;
            arr=new int[capacity];
            top=-1;
            size=0;
        }
        
        public void push(int data){
            if(size==capacity){
                System.out.print("stack is full");
                return;
            }
            top=(top+1)%capacity;
            arr[top]=data;
            size++;
            return;
        }
        public int pop(){
            if(size==0){
                System.out.print("stack is empty");
                return -1;
            }
            int val=arr[top];
            top=(top-1+capacity)%capacity;
            size--;
            return val;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int peek(){
            if(size==0){
                System.out.print("stack is empty");
                return -1;
            }
            return arr[top];
        }
    }
	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()){
		    System.out.print(s.peek()+" ");
		    s.pop();
		}
	}
}
