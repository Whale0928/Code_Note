package src.com.programmers.java.basic;

import java.util.*;

class myData{
    int v;
    public myData(int v) {
        this.v = v;
    }

    @Override
    public String toString(){
        return String.valueOf(v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myData myData = (myData) o;
        return v == myData.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}

public class TreeMain {
    public static void main(String[] args) {
        //Graph와 마찬가지로 따로 제공해주는 것이 없다.
        //BST , Heap

        Set<MyData> set = new TreeSet<>(); //Binary Search Tree
        set.add(new MyData(1));
        set.add(new MyData(2));
        set.add(new MyData(3));
        //System.out.println(set);

        //Heap
        //sort :: O(nLogn)
        //heapify :: O(logn)

        PriorityQueue<MyData> queue = new PriorityQueue();
//        Queue<Integer> queue = new PriorityQueue();
//        Queue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());

        Random r = new Random();
        for(int i =0 ; i<20; i++)queue.offer(new MyData(r.nextInt(50)));
//        System.out.println(queue);
        List<MyData> sorted = new LinkedList<>();
        System.out.println(queue); //정렬되어있지 않다가
        while(!queue.isEmpty())sorted.add(queue.poll());
        System.out.println(sorted); // 꺼내면서 정렬되어 진다.

//        queue.offer(100);
//        queue.offer(10);
//        queue.offer(10);
//        queue.offer(40);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
    }
}
