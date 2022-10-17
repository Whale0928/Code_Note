package src.com.programmers.java.quest;

public class NextNumber {
    /**
     * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
     *
     * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
     * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
     * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
     * 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
     *
     * 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
     *
     * 제한 사항
     * n은 1,000,000 이하의 자연수 입니다.
     * 입출력 예
     */

    public static void main(String[] args) {
            int reuslt =    new NextNumber().solution(78);
           System.out.println("reuslt = " + reuslt);
    }
    public int solution(int n) {
        // 1. n 보다 큰 수이면서 . n과 1의 개수가 동일하다.
        // 2. 조건을 만족하면서  . "가장 작은 수"

        // solution
        // n부터 1씩 증가하며 반복
        // 증가된 수 u 를 이진수로 변환
        // 변환된 2진수의 1의 개수를 카운트 한다.
        // 카운트된 값이 n(2) 의 1의 개수가 동일한 경우 해당 값을 반환

        //n 의 배열을 기록한 변수.
        final int standard =  Integer.bitCount(n);
        //정답을 대입하는 변수.
        int answer = 0;

        while(answer ==0 ){
            n++; //n을 증가
            int temp = Integer.bitCount(n);
            if(temp == standard) answer = n;
        }
        return n;
    }
}
