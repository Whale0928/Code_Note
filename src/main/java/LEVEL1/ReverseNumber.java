package main.java.LEVEL1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseNumber{

    public static void main(String[] args) {
       long l =  solution(118372l);
        System.out.println(l);
    }
    public static long solution(long n) {
        List<Integer> list = quickSort(Arrays.stream(String.valueOf(n).split("")).
                map(Integer::parseInt).collect(Collectors.toList()));

        System.out.println(list);
        return 0l;
    }

    static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;

        int pivot = list.remove(0);
        List<Integer> lesser = new LinkedList<>();
        List<Integer> greater = new LinkedList<>();

        for (Integer m : list) {
            if (pivot> 0) lesser.add(m);
            else greater.add(m);
        }
        List<Integer> merged = new LinkedList<>();
        merged.addAll(quickSort(greater));
        merged.add(pivot);
        merged.addAll(quickSort(lesser));
        return merged;
    }
}
