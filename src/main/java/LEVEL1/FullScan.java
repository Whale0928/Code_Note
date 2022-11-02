package main.java.LEVEL1;

import java.util.Arrays;

public class FullScan {
    //Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
//    Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
//
//    Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//    제한사항
//    갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
//    노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
//    카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.


//    brown	yellow	return
//        10	2	[4, 3]
//        8	1	[3, 3]
//        24	24	[8, 6]

    public static void main(String[] args) {
        int[] arr = new FullScan().solution(10,2);
        int[] arr2 = new FullScan().solution(8,1);
        int[] arr3 = new FullScan().solution(24,24);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum =brown+yellow;
        int i =0;
        int divide=0;
        //시작과 끝에는 갈색이여야 한다.
        //가로와 세로는 같을 수 도 있다.
        // Yellow는 항상 가로 세로 -2씩 제외해야 한다.
        //약수 구하기.

        for(i=1; i<=sum; i++){

          //모든 칸수 나누기 i
          //divide는 나눠진 행의 개수
          //i는 나눈 칸수
          // 9/3 == divide == 3;
         divide = sum/i;
            //약수이면서 가로가 더 큰 수
            //9%3==0 이면서 3이 크거나 같은 때.
            if(sum%i==0&&divide>=i){
                //가운데에 위치해야 하니 3 이상인 수들
                if(i>=3&&divide>=3){
                    //가로-2  *  세로*2
                    if((i-2)*(divide-2)==yellow){
                    //카펫의 가로, 세로 크기를
                        answer[0] = divide;
                        answer[1] = i;
                    }
                }
            }
        }
        //세로가 더 큰 경우 제와.
        return answer;
    }

}
