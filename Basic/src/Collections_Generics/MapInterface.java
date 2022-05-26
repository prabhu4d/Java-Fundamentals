package Collections_Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("name", "prabhu");
        map.put("age", "23");

        System.out.println(map.get("name"));

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
