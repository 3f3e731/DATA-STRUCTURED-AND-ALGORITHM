import java.util.*;

public class Main {
    public static int minCost(List<Integer>ropes){
        if(ropes.size()==1){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<ropes.size();i++){
            for(int j=i+1;j<ropes.size();j++){
                int cost=ropes.get(i)+ropes.get(j);

                List<Integer> newRope=new ArrayList<>(ropes);
                newRope.remove(j);
                newRope.remove(i);
                newRope.add(cost);

                ans=Math.min(ans,cost+minCost(newRope));
            }
        }
        return ans;
    }

    public static int minCostOptimize(List<Integer>ropes){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int r:ropes){
            pq.add(r);
        }
        int totalCost=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();

            int Cost=first+second;
            totalCost=totalCost+Cost;

            pq.add(Cost);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        List<Integer>ropes=Arrays.asList(4,3,2,6);
        System.out.println("Minimum Cost:"+minCost(ropes));
        System.out.println("Minimum Cost:"+minCostOptimize(ropes));
    }
}