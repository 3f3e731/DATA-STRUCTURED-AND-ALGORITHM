import java.util.*;
class Hashing{
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        //Add-O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);

        //Using Iterators-O(N)
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        
        //Using Enhanced for Loop
        for(int s:set){
            System.out.println(s);
        }
    }
}