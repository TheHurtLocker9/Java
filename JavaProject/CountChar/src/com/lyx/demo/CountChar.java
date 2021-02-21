package com.lyx.demo;

import java.util.*;

/**
 * 统计一个字符串中字符出现的次数
 */
public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要统计的字符串：");
        String userStr = scanner.nextLine();
        LinkedHashMap<Character, Integer> countCharMap = findChar(userStr);
        Set<Map.Entry<Character, Integer>> entrySet = countCharMap.entrySet();
        for (Map.Entry<Character,Integer> entry : entrySet){
            System.out.println("'"+entry.getKey()+"'字符出现了"+entry.getValue()+"次");
        }
        scanner.close();
    }

    /**
     * 从字符串中遍历每一个字符，判断后存入Map集合
     * @param userStr 用户输入的字符串
     * @return 存有统计信息的 LinkedHashMap集合(保证顺序，方便查验)
     */
    private static LinkedHashMap<Character,Integer> findChar(String userStr) {
        LinkedHashMap<Character,Integer> countCharMap = new LinkedHashMap<>();
        int index = 0;
        while (index<userStr.length()){
            char c = userStr.charAt(index++);
            if (!countCharMap.containsKey(c)){
                countCharMap.put(c,1);
            }else {
                countCharMap.put(c,countCharMap.get(c)+1);
            }
        }
        return countCharMap;
    }

}
