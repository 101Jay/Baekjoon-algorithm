package com.practice.problem.pro_1152;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine().trim();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /** 문자열의 비교는 .isEmpty(), equals 메서드를 활용하자. */
        if(inputStr.isEmpty()){
            bw.write(String.valueOf(0));
            bw.close();
            return;
        }

        String[] wordArr = inputStr.split(" ");

        bw.write(String.valueOf(wordArr.length));
        bw.close();

    }
}
