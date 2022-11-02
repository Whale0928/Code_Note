package main.java.LEVEL1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinNumber {

    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        //int[] arr ={10};
        int[] i = solution(arr);


        System.out.println(Arrays.toString(i));
    }
        public static int[] solution(int[] arr) {
            if(arr.length <2 ) return new int[]{-1};
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

            list.remove(Collections.min(list));
            return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
