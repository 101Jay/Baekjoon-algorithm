package com.practice.problem.pro_11720;

import java.io.*;

public class Main {

    /**
     * 최대 100자릿수까지 숫자를 처리해야 하기 때문에 int, long으로는 불가
     * 문자열로 받아서 처리
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int inputNum = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int result = 0;

        for(int i = 0; i < input.length; i++){
            result += Integer.parseInt(String.valueOf(input[i]));
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
