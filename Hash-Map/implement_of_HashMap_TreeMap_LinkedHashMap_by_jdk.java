import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();//unorder
        hm.put("India",100);
        hm.put("china",150);
        hm.put("Uk",50);
        hm.put("Nepal",5);

        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();//order
        lhm.put("India",100);
        lhm.put("china",150);
        lhm.put("Uk",50);
        lhm.put("Nepal",5);

        TreeMap<String,Integer> tm=new TreeMap<>();//sort by key
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Uk",50);
        tm.put("Nepal",5);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }

}