import java.util.*;
class Hashing{
    public static void main(String[] args) {
        HashMap<String ,Integer>map=new HashMap<>();

        //Put-O(1)
        map.put("Tea",10);
        map.put("Pizza",150);
        map.put("Burger",50);
        map.put("Pasta",100);

        Set<String>Keys=map.keySet();//O(1)
        for(String k:Keys){
            System.out.println("Keys="+k+",Value="+map.get(k));
        }
    }
}