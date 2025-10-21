import java.util.*;
class Hashing{
    public static void main(String[] args) { 
        HashMap<String ,Integer>map=new HashMap<>();

        //Put-O(1)
        map.put("Tea",10);
        map.put("Pizza",150);
        map.put("Burger",50);
        map.put("Pasta",100);

        System.out.println(map);

        //Get-O(1)
        int price=map.get("Tea");
        System.out.println(price);//10

        System.out.println(map.get("momos"));//null

        //ContainsKey-O(1)
        System.out.println(map.containsKey("Burger"));//true
        System.out.println(map.containsKey("momos"));//false

        //Remove-O(1)
        System.out.println(map.remove("Burger"));
        System.out.println(map);

        //Size-O(1)
        System.out.println(map.size());//3

        //Is Empty-O(1)
        System.out.println(map.isEmpty());

        //Clear-O(1)
        map.clear();
        System.out.println(map.isEmpty());//true
    }
}