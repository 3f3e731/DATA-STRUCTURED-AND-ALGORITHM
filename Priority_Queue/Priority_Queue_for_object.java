import java.util.*;

class BST{
    static class Students implements Comparable<Students>{
        String name;
        int rank;

        public Students(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Students s2){
            return this.rank- s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Students>pq=new PriorityQueue<>();

        pq.add(new Students("A",43));//O(logn)
        pq.add(new Students("B",2));
        pq.add(new Students("C",86));
        pq.add(new Students("D",76));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);//O(1)
            pq.remove();//O(logn)
        }
    }
}