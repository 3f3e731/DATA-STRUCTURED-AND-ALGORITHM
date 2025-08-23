import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []val={60,100,120};
        int []weight={10,20,30};
        int W=50;

        double[][]ratio=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int Capacity=W;
        int ans=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(Capacity>=weight[idx]){
                ans=ans+val[idx];
                Capacity=Capacity-weight[idx];
            }
            else{
                ans=ans+((int)ratio[i][1]*Capacity);
                Capacity=0;
                break;
            }
        }
        System.out.println("Maximum value:"+ans);
    }
}