import java.util.*;
class Main {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Edge>[]graph=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        for(int[]p:prerequisites){
            int course=p[0];
            int preCourse=p[1];

            graph[preCourse].add(new Edge(preCourse,course));
        }

        int[]indeg=new int[numCourses];

        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                indeg[e.dest]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        int[]result=new int[numCourses];
        int idx=0;

        while(!q.isEmpty()){
            int curr=q.remove();
            result[idx++]=curr;

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        if(idx!=numCourses){
            return new int[0];
        }
        return result;
    }
    public static void main(String[]args){
        int numCourses=4;
        int[][]prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        int[]result=findOrder(numCourses,prerequisites);

        System.out.print("Topological Sort:");
        System.out.print(Arrays.toString(result));
    }
}