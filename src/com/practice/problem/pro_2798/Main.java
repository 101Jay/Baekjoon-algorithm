package com.practice.problem.pro_2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * N과 M을 입력 받는다.
     * N만큼 반복문을 돌려 N개의 숫자를 int 배열에 입력한다.
     * N * (N-1) * (N-2) / 6 만큼 반복문을 돌려 임의의 숫자 3개를 선택한다.
     * */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());
        int maxVal = Integer.parseInt(st.nextToken());

        // 입력 받기
        int[] inputArr = new int[inputNum];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < inputNum; i++){
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        int makeVal = -1;
        for(int i = 0; i < inputNum; i++){
            for(int j = i+1; j < inputNum; j++){
                for(int k = j+1; k < inputNum; k++){
                    int curVal = inputArr[i] + inputArr[j] + inputArr[k];
                    if( maxVal >= curVal && curVal > makeVal){
                        makeVal = curVal;
                    }
                }
            }
        }
        bw.write(String.valueOf(makeVal));
        bw.close();
    }
}
