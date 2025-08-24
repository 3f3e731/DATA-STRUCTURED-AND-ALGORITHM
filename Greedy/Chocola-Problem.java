import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer[]CostVer={2,1,3,1,4};
        Integer[]CostHor={4,1,2};

        Arrays.sort(CostVer,Collections.reverseOrder());
        Arrays.sort(CostHor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=0,vp=0;
        int MinCost=0;

        while(h<CostHor.length && v<CostVer.length){
            if(CostVer[v]<=CostHor[h]){
                MinCost+=(CostHor[h]*vp);
                hp++;
                h++;
            }
            else{
                MinCost+=(CostVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<CostHor.length){
            MinCost+=(CostHor[h]*vp);
            hp++;
            h++;
        }
        while(v<CostVer.length){
            MinCost+=(CostVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Minimum Cost of cuts:"+MinCost);
    }
}