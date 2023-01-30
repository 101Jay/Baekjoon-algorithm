package com.practice.problem.pro_1018;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * 1. 크기를 입력 받고 해당하는 크기만큼의 이차원 정수 배열을 만든다.
     * 2. 8*8을 만들 수 있는 모든 경우의 수를 돌아가면서 다시 칠해야하는 정사각형의 개수를 구한다.
     *      <모든 경우의 수 돌아가기>
     *      - 가로를 기준으로 하나씩 늘려가며 8개의 가로를 맞춘다.
     *      - 가로의 끝에 도달하면 세로로 한 칸 내려가며 이를 반복한다.
     *      <다시 칠해야 하는 정사각형 개수 구하기>
     *      - 이전 타일의 색을 기억하며, 옆 타일은 이전 타일과 다른 색을 갖도록 한다.
     *      - 다음 줄로 내려갈 땐 위의 것과 색이 다른지 확인한다.
     * 3. 개수의 최소값을 구한다.
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        char[][] inputArr = new char[width][height];


        for(int i = 0; i < height; i++){
            char[] inputLine = br.readLine().trim().toCharArray();
            for(int j = 0; j < width; j++){
                inputArr[i][j] = inputLine[j];
            }
        }

        int[][] testArr = new int[8][8];

        for(int i = 0; i <= height - 8; i++){
            // 세로에서 한 칸 내려가면서 반복

            for(int j = 0; j <= width - 8; j++){
                // 가로 한 칸 옆으로 가면서 끝까지 감

            }
        }

    }
}
