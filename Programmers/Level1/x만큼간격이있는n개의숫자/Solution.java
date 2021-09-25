package Programmers.Level1.x만큼간격이있는n개의숫자;

import java.util.Arrays;

public class Solution {

    public long[] solution(int x, int n) {

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 3)));
        System.out.println(Arrays.toString(s.solution(-4, 2)));
    }


}

