package main.java.LEVEL1;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] i = solution(12321511145l);
    }

    public static int[] solution(long n) {
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        return arr;
    }
}
