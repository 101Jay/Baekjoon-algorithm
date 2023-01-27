package com.practice.problem.pro_10951;

import java.io.*;

public class Main {

    /** Baekjoon 사이트는 입력 자체가 파일로 되어 있어 EOF를 처리할 수 있지만,
     * Intelli J에서는 EOF를 찾지 못해 입력의 끝을 알 수 없다. */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr;
        String[] inputArr;

        int result;

        while((inputStr = br.readLine()) != null){
            inputArr = inputStr.trim().split(" ");
            result = Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1]);

            bw.write(String.valueOf(result) + "\n");
        }
        bw.close();
    }
}
