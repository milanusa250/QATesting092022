package datastructure.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        hs.add(9);
        hs.add(9);
        hs.add(9);
        hs.add(4);
        hs.add(4);

        System.out.println(hs);

    }
}
