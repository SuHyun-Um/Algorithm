package Programmers.Level1.행렬의덧셈;

import java.util.Arrays;

class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;

    }

    /**
     * 직접 실행
     **/
    public static void main(String[] args) {

        int arr1[][] = {{1, 2}, {2, 3}};
        int arr2[][] = {{3, 4}, {5, 6}};
        int arr3[][] = {{4, 6}, {7, 9}};

        Solution s = new Solution();


        System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 2}}, new int[][]{{3, 4}})));

    }

}
