import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[]coins={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int amount=590;
        int countCoins=0;

        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while(amount>=coins[i]){
                    ans.add(coins[i]);
                    countCoins++;
                    amount=amount-coins[i];
                }
            }
        }
        System.out.println("total (min) coin used: "+countCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}