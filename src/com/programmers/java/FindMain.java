package com.programmers.java;

import java.util.LinkedList;
import java.util.List;

public class FindMain{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<100; i++){
            list.add(i);
        }

        System.out.println(list.indexOf(64));
        //리니어 서치라는 기능이 구현되어 있기 때문
        //indexOf은 완전탐색을 할 수 밖에 없다.

        //객체에 Equls 오버라이딩을 활용해 값을 비교해야한다.


        // binarySearch   : return Integer
        // Comparable를 상속 받아야한다
        // 1==1 : 1 - 1 ==0 : 같다
        // 1 ? 2  1- 2를 뺀 후 0하고 비교한다
        // 같으면 0 : 내게 더 크면 1+ , 작으면 -1 를 반환

        //가운데에서 양 옆을 비교 하며 양를 줄여간다
        //기본 전제가 "정렬" 이다.

        //search       : indexOf , contians , remove 등등의 기능에서 이미 구현되어있다 (완전 탐색)
        //               equals 제공 필요
        //Collection.binarySearch :  Sort가 필요하다 ,
        //                           Comparble 구현 필요

        //완전 탐색과 이진탐색을 구분해서 써야겟다.
    }

}
