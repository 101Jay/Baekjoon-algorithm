package com.practice.problem.pro_7568;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * (몸무게, 키) => 덩치
     * 덩치 등수 -> 나보다 더 큰 사람을 n명이라고 한다면 n+1 등이라고 할 수 있음
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());
        int[] weightArr = new int[inputNum];
        int[] heightArr = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            weightArr[i] = Integer.parseInt(st.nextToken());
            heightArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] resultArr = new int[inputNum];
        for(int i = 0; i < weightArr.length; i++){
            int cnt = 1;
            for(int j = 0; j < weightArr.length; j++){

                if( weightArr[i] < weightArr[j] && heightArr[i] < heightArr[j]){
                    cnt++;
                }
            }
            resultArr[i] = cnt;
        }

        for(int i : resultArr){
            bw.write(String.valueOf(i) + " ");
        }
        bw.close();
    }
}
