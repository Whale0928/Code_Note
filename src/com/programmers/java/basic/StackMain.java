package com.programmers.java.idea;

import java.util.LinkedList;
import java.util.Queue;

public class StackMain {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();

        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);

        System.out.println(list); // 큐
        list.poll();
        System.out.println(list); // 큐



    }
}
