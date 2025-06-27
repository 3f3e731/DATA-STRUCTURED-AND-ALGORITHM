import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("India",400000);
        hm.put("china",300000);
        hm.put("America",108800);
        hm.put("Nepal",20000);
        hm.put("Uk",300000);

        Set<String> keys=hm.keySet();//entry set
        for(String k:keys){
            System.out.println("Key="+k+",value="+hm.get(k));
        }

       System.out.println(hm);

       int population=hm.get("India");//get
       System.out.println(population);

       System.out.println(hm.get("Indonesia"));

       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("Indonesia"));

       System.out.println(hm.remove("India"));
       System.out.println(hm);

       System.out.println(hm.size());
    }
}
