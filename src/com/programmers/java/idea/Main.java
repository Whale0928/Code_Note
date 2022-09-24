package com.programmers.java.idea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 6};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();

        int max = 1;
        for (int i : arr) {
            if (i > max) max = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                answer.add(i);
            }
        }

        int[] ans = answer.stream().mapToInt(Integer::intValue).toArray();

        return ans;
    }
}

