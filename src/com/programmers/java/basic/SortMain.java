package src.com.programmers.java.basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


class MyData implements Comparable<MyData>{
    int v;

    public MyData(int v){
        this.v = v;
    }

    @Override
    public String toString() {
        return String.valueOf(v); // ""+ V 보다 권장되는 방식
    }

    @Override
    public int compareTo(MyData o) {
        return Integer.compare(v,o.v); // o1.v-o2.v 보다 권장되는 방식
    }
}

public class SortMain {

    public static void main(String[] args) {
      //정렬
        List<MyData> list = new LinkedList<>();

        Random r = new Random();
        for(int i=0;i<20;i++) list.add(new MyData(r.nextInt(50)));


        //list.sort(Comparator.naturalOrder());   //오른차순
        /**
         *  list.sort(Comparator.reverseOrder());
         *         인자가 반드시 필요.
         *         list.sort((o1,o2)-> o2.compareTo(o1));
         *         list.sort(new Comparator<MyData>(){
         *             @Override
         *             public int compare(MyData o1, MyData o2) {
         *                 return o2.v-o1.v;
         *             }
         *         });
         */

        list = quickSort(list);

        System.out.println(list);
    }


    static List<MyData> quickSort(List<MyData> list){
        //quick 방식으로 정렬해 다시 반환한다.
          if(list.size()<=1) return list;

        MyData pivot = list.remove(0); //피봇을 하나 구함
        List<MyData> lesser = new LinkedList<>();
        List<MyData> greater = new LinkedList<>();

        for(MyData m: list){
            if(pivot.compareTo(m)>0) lesser.add(m) ;
           else greater.add(m);
        }

        List<MyData> merged = new LinkedList<>();
        merged.addAll(quickSort(greater)); //큰값
        merged.add(pivot);                 //기준
        merged.addAll(quickSort(lesser));  //작은값 == 내림차순


        int[] arr = new int[4];
        List<Integer> rlist = new LinkedList<>();
        Arrays.asList(rlist);
        return merged;
    }
}

