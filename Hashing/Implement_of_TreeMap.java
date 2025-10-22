import java.util.*;
class Hashing{
    public static void main(String[] args) {
        TreeMap<String ,Integer>tm=new TreeMap<>();//keys are sorted  

        //Put-O(logN)
        tm.put("Tea",10);
        tm.put("Pizza",150);
        tm.put("Burger",50);
        tm.put("Pasta",100);

        System.out.println(tm);

        System.out.println();

        Set<String>Keys=tm.keySet();//O(1)
        for(String k:Keys){
            System.out.println("Keys="+k+",Value="+tm.get(k));
        }

    }
}