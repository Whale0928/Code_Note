package main.java.LEVEL1;

public class CocaCola {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println(solution(3, 2, 20));
    }//


    public static int solution(int a, int b, int n) {
        int answer = 0;
        int divid = 0;

        while (n >= a) {
            answer += (n / a) * b; //교환비에 맞쳐 정답에 누적
            divid += n % a;
            n = (n / a) * b;
            if (n < a) {
                n += divid;
                divid = 0;
            }
        }

        return answer;
    }
}
