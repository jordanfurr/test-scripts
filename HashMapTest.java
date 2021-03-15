import java.util.Map;
import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        HashMap<String, String> stringMap = new HashMap<String, String>();
        populateHashMaps(map, stringMap);

        System.out.println("iterating hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("pulling value at index 0 in map...");
        System.out.println(map.get(0));

        System.out.println("pulling value at index 1 in map...");
        System.out.println(map.get(1));

        System.out.println("pulling value at index 'Jordan' in stringMap...");
        System.out.println(stringMap.get("Jordan"));
    }

    private static void populateHashMaps(HashMap<Integer, String> map, HashMap<String, String> stringMap) {
        map.put(0, "vox");
        map.put(1, "guitar");
        map.put(2, "bass");
        map.put(3, "drums");
        map.put(4, "keys");

        stringMap.put("Jordan", "Furr");
        stringMap.put("James", "Jones");
    }

}
