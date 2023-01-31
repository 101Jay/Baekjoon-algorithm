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
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        // 이차원 배열 선언
        char[][] inputArr = new char[height][width];

        // 입력을 이차원 배열로 초기화
        for(int i = 0; i < height; i++){
            char[] inputLine = br.readLine().trim().toCharArray();

            for(int j = 0; j < width; j++){
                inputArr[i][j] = inputLine[j];
            }
        }

        // 최소가 될 수 없는 65를 최소로 초기화 -> 어떤 값이 와도 갱신 가능
        int minVal = 65;

        int count;

        char beforeVal;
        char beforeParagraphVal;
        for(int i = 0; i <= height - 8; i++){
            // 세로에서 한 칸 내려가면서 반복

            for(int j = 0; j <= width - 8; j++){
                // 가로 한 칸 옆으로 가면서 끝까지 감

                // count 초기화
                count = 0;

                /** 가장 처음 값이 B인 버전 : 다음번부터는 W로 시작해야 함. */
                beforeVal = 'B';
                beforeParagraphVal = 'B';

                if(inputArr[i][j] != 'B'){
                    count++;
                }

                for(int a = i; a < i+8; a++){

                    // beforeVal 초기화 -> 윗변과의 차이점을 고려하여 반대로 설정
                    if(a > i){
                        if(beforeParagraphVal == 'B'){
                            beforeVal = 'W';
                            beforeParagraphVal = 'W';
                            if(inputArr[a][j] != 'W'){
                                count++;
                            }
                        } else {
                            beforeVal = 'B';
                            beforeParagraphVal = 'B';
                            if(inputArr[a][j] != 'B'){
                                count++;
                            }
                        }
                    }

                    for(int b = j; b < j+8; b++){
                        if(b != j+7 && beforeVal == inputArr[a][b+1]){
                            // 옆에 있는 요소들과 같으면 색칠해줘야 함
                            count++;
                            if(inputArr[a][b+1] == 'W'){
                                beforeVal = 'B';
                            } else {
                                beforeVal = 'W';
                            }
                        }else {
                            // 다음 요소로 beforeVal 갱신
                            if(b < j+7){
                                beforeVal = inputArr[a][b+1];
                            }
                        }
                    }
                }

                if(minVal > count){
                    minVal = count;
                }

                // count 초기화
                count = 0;

                /** 가장 처음 값이 W인 버전 : 다음번부터는 B로 시작해야 함. */
                beforeVal = 'W';
                beforeParagraphVal = 'W';

                if(inputArr[i][j] != 'W'){
                    count++;
                }

                for(int a = i; a < i+8; a++){

                    // beforeVal 초기화 -> 윗변과의 차이점을 고려하여 반대로 설정
                    if(a > i){
                        if(beforeParagraphVal == 'B'){
                            beforeVal = 'W';
                            beforeParagraphVal = 'W';
                            if(inputArr[a][j] != 'W'){
                                count++;
                            }
                        } else {
                            beforeVal = 'B';
                            beforeParagraphVal = 'B';
                            if(inputArr[a][j] != 'B'){
                                count++;
                            }
                        }
                    }

                    for(int b = j; b < j+8; b++){
                        if(b != j+7 && beforeVal == inputArr[a][b+1]){
                            // 옆에 있는 요소들과 같으면 색칠해줘야 함
                            count++;
                            if(inputArr[a][b+1] == 'W'){
                                beforeVal = 'B';
                            } else {
                                beforeVal = 'W';
                            }
                        }else {
                            // 다음 요소로 beforeVal 갱신
                            if(b < j+7){
                                beforeVal = inputArr[a][b+1];
                            }
                        }
                    }
                }

                if(minVal > count){
                    minVal = count;
                }

            }
        }

        bw.write(String.valueOf(minVal));
        bw.close();
    }
}