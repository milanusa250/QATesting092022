package datastructure.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(0);

        System.out.println(list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
