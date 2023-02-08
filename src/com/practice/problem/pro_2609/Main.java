package com.practice.problem.pro_2609;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * 최대공약수 : 유클리드 호제법을 활용하여 구함
     * 최소공배수 : 두 수를 곱한 후, 최대공약수를 제곱한 수로 나눔
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int minVal = first * second;

        int modNum = first % second;
        while(modNum > 0){

            first = second;
            second = modNum;
            modNum = first % second;
        }

        int maxVal = second;
        bw.write(String.valueOf(maxVal) + "\n");

        minVal /= maxVal;
        bw.write(String.valueOf(minVal));
        bw.close();

    }
}
