package Programmers.Level1.직사각형별찍기;

import java.util.Scanner;
/*
- 정수 n과 m을 입력받아야 하니까 Scanner로 받아서 int n, m에 넣어주기

- "*"이 n(가로)만큼 다 찍으면 개행하는 행위를 m(세로)만큼 반복하기
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 행
        int m = scanner.nextInt();  // 열
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
        }
    }
}