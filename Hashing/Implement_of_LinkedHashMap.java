import java.util.*;
class Hashing{
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer>lhm=new LinkedHashMap<>();//Order is Maintain - it follow the Doubly Linked List

        //Put-O(1)
        lhm.put("Tea",10);
        lhm.put("Pizza",150);
        lhm.put("Burger",50);
        lhm.put("Pasta",100);

        System.out.println(lhm);
        
        System.out.println();
        
        Set<String>Keys=lhm.keySet();//O(1)
        for(String k:Keys){
            System.out.println("Keys="+k+",Value="+lhm.get(k));
        }

    }
}