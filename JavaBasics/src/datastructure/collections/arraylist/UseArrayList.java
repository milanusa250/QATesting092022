package datastructure.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(0);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);


        System.out.println(list);

        list.remove(2);

        System.out.println(list);
//        for (int num: list) {
//            System.out.println(num);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
