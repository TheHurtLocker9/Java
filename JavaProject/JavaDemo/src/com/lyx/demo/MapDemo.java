package com.lyx.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("LYX",1998916);
        hashMap.put("CXY",19991108);
        hashMap.put("CXX",10000000);
        /*
        1.通过KeySet( )方法获取Key键的Set集合，通过对Set集合的遍历实现对Map<k,v>集合的遍历.
         */
        //Set集合构造器
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = hashMap.get(key);
            System.out.println(key+":"+value);
        }

        /*
        2.通过entrySet( )方法获得Map.Entry类的Set集合，通过对Set集合的遍历实现对Map<k,v>集合的遍历.
         */
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
