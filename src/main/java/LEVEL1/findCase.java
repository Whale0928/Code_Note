package main.java.LEVEL1;


public class findCase {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};

        System.out.println(new Solution().solution(arr,3));
//[1, 1, 1, 1, 1]	3	5
//[4, 1, 2, 1]	4	2
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        return sumCount(numbers,target,0,0);
    }
    public int sumCount(int[] numbers, int target,int index,int sum){
        if(index == numbers.length){
            if(sum==target) return 1;
            else            return 0;
        }

        int plus = sumCount( numbers,  target,index+1, sum+numbers[index]);
        int minus  =sumCount( numbers,  target,index+1, sum-numbers[index]);
        return plus+minus;

    }
}