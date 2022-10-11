package src.com.programmers.java.quest;

public class Plus_yin_and_yang{
    public static void main(String[] args) {
        int arr[] = {4,7,12};
        boolean signs[] = {true,false,true};
        int i = solution(arr,signs);
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        return sum(absolutes,signs,0,0);
    }

    public static int sum(int num[], boolean[] flag, int index,int lastSum){
        if(num.length==index) return lastSum;
        else if(flag[index])lastSum+=Integer.parseInt("+"+num[index]);
        else           lastSum+=Integer.parseInt("-"+num[index]);


        return sum(num,flag,index,lastSum);
    }
}

/*
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

absolutes의 길이는 1 이상 1,000 이하입니다.
absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
signs의 길이는 absolutes의 길이와 같습니다.
signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

[+4,-7,+12]	[true,false,true]	9

*/

