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

        //Contains-O(1)
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(set.contains(5)){
            System.out.println("set contains 5");
        }

        //Remove-O(1)

        set.remove(2);
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(!set.contains(2)){
            System.out.println("set not contains 2");
        }

        //Clear-O(N)
        set.clear();
        System.out.println(set);

        //Size-O(1)
        System.out.println(set.size());

        //isEmpty-O(1)
        System.out.println(set.isEmpty());
    }
}