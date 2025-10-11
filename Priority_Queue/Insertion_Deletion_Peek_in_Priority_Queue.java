import java.util.*;

class Heaps{
    static class Heap{
        List<Integer>arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;// child node
            int par=(x-1)/2; //parent node

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void heapify(int i){
            int leftChild=2*i+1;
            int rightChild=2*i+2;
            int minIdx=i;

            if(leftChild < arr.size() && arr.get(minIdx) > arr.get(leftChild)){
                minIdx=leftChild;
            }
            if(rightChild < arr.size() && arr.get(minIdx) > arr.get(rightChild)){
                minIdx=rightChild;
            }
            if(minIdx!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            if(arr.isEmpty()) return -1;

            int data=arr.get(0);

            arr.set(0,arr.get(arr.size()-1));
            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(5);
        h.add(1);

        while(!h.isEmpty()){
            System.out.print(h.peek()+" ");
            h.remove();
        }
        if (!h.isEmpty()) {
            System.out.println(h.peek());
        }
    }
}