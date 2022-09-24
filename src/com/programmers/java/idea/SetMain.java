package com.programmers.java.idea;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);

        System.out.println(set);
    }
}
