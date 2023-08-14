package week02;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value pair
        // Key 라는 값으로 Unique하게 보장 되야함
        // Map -> HashMap, TreeMap 으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일",11);
        intMap.put("이",131);
        intMap.put("십",151);
        intMap.put("십",14);
        intMap.put("십1",13);
        intMap.put("십",12);

        // key
        for (String key: intMap.keySet()
             ) {
            System.out.println(key);
        }

        // value
        for (Integer value: intMap.values()
        ) {
            System.out.println(value);
        }

        System.out.println(intMap.get("이"));
    }
}
