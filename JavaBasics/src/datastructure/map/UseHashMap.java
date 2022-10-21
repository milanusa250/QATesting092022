package datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "NYC");
        map.put(2, "Miami");
        map.put(3, "LA");
        map.put(4, "Cali");
        map.put(5, "Chicago");
        map.put(6, "Dallas");

        System.out.println(map.get(2));

        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
