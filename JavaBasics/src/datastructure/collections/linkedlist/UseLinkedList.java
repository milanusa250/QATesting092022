package datastructure.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("john");
        list.add("sean");
        list.add("dave");
        list.add("jack");
        list.add("brooklyn");

        System.out.println(list);

        list.remove(4);

        System.out.println(list);
    }
}
