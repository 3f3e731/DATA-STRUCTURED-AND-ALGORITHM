import java.util.*;

class Main{
    public static void combination(int n, int k, int index, ArrayList<ArrayList<Integer>>result, ArrayList<Integer>curr){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(index>n){
            return;
        }
        curr.add(index);
        combination(n,k,index+1,result,curr);
        curr.remove(curr.size()-1);
        combination(n,k,index+1,result,curr);
    }
    public static void main(String[] args){
        int n=4,k=2;
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        combination(n,k,1,result,new ArrayList<>());
        System.out.println(result);
    }
}