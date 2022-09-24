package com.programmers.java;

import java.util.Hashtable;

public class MapMain {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        System.out.println(map);
        System.out.println(map.getOrDefault("S",-2));
    }
}
