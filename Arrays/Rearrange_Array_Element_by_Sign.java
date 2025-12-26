import java.util.*;
class Main{
    //Brute Force
    public static int[] RearrangeArr(int[]arr){
        int n=arr.length;
        List<Integer>postiveArr=new ArrayList<>();
        List<Integer>negativeArr=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                postiveArr.add(arr[i]);
            }
            else{
                negativeArr.add(arr[i]);
            }
        }
        List<Integer>ans=new ArrayList<>();
        int idxPos=0,idxNeg=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && idxPos<postiveArr.size()){
                ans.add(postiveArr.get(idxPos++));
            }
            else if(idxNeg<negativeArr.size()){
                ans.add(negativeArr.get(idxNeg++));
            }
        }
        int[]result=new int[n];
        int idx=0;
        for(int i=0;i<ans.size();i++){
            result[idx++]=ans.get(i);
        }
        return result;
    }
    // Optimal:- Only runs equal no. of positive and negative element
    public static int[] RearrangeArrTwoPointer(int[]arr){
        int n=arr.length;
        int []ans=new int[n];

        int posIdx=0, negIdx=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && posIdx<n){
                ans[posIdx]=arr[i];
                posIdx+=2;
            }
            else if(arr[i]<0 && negIdx<n){
                ans[negIdx]=arr[i];
                negIdx+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,-4,-5};

        int[]result=RearrangeArr(arr);
        System.out.println(Arrays.toString(result));

        int[]res=RearrangeArrTwoPointer(arr);
        System.out.println(Arrays.toString(res));
    }
}