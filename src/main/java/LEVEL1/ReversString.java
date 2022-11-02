package main.java.LEVEL1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversString {
    /** N 개의 단어가 주어지면 그 단어를 뒤집어 출력한다.
     *  1. 몇개의 단어가 주어지는지 n으로 주어짐
     *  2. 단어를 반복해 입력 받는다.
     *
     *  원래 String으로 객체를 생성하면 고정된다
     *  하지만 StringBuilder는 출력될때까지 유지된다.
     *
     *  만약 양쪽 끝 단어만 뒤집고 싶을 경우. 2번
     */
    public ArrayList<String> solution (int n , String[] str){
        ArrayList<String> solution = new ArrayList<>();
        ArrayList<String> solution2 = new ArrayList<>();
        for(String x : str){
            String temp = new StringBuilder(x).reverse().toString();
            solution.add(temp);
        }

        //---2 번
        for(String x : str){
            char[] s = x.toCharArray();
            //s는 문자 배열
            int lt= 0;
            int rt = x.length()-1;
            while(lt<rt){
                char temp = s[lt];
                s[lt] =s[rt];
                s[rt] =temp;
                rt--;
                lt++;
            } //리버스를 직접 구현한 것.

            //valueOf는 Static으로 선언된 클래스 메서드다
            String temp = String.valueOf(s);
            solution2.add(temp);

        }

        return solution2;
    }

    public static void main(String[] args) {
        ReversString T = new ReversString();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i=0;i<n;i++){
            strArr[i] = sc.next();
        }

        for (String x : T.solution(n,strArr)){
            System.out.println(x);
        }

    }
}
