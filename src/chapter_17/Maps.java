package chapter_17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap 性能最好，LinkedHashMap 插入有序，TreeMap 插入排序
 * Created by KaiLee on 2016/3/5.
 */
public class Maps {
    public static void main(String[] args) {
        String[] value = "updating your profile with your name and location and a profile picture helps other GitHub users get to know you".split(" ");
        Map<Integer, String> hashMap = new HashMap<>();
        for(String v : value) {
            hashMap.put(v.hashCode(), v);
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        Map<Integer, String> treeMap = new TreeMap<>();
        for(String v : value) {
            treeMap.put(v.hashCode(), v);
        }
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        for(String v : value) {
            linkedMap.put(v.hashCode(), v);
        }
        System.out.println(linkedMap);
    }
}