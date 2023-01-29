package com.practice.problem.pro_10809;

import java.io.*;

public class Main {

    /**
     * 1. 문자열을 입력 받는다.
     * 2. 26번의 반복문을 돌려 해당 문자가 있으면 그 문자열의 인덱스를, 없으면 -1을 결과 배열에 저장한다.
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] inputCharArr = br.readLine().trim().toCharArray();

        int[] resultArr = new int[26];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = -1;
        }
            
        for(int i = 0; i < inputCharArr.length; i++){
            int resultAsc = (int) inputCharArr[i] - 97;
            if(resultArr[resultAsc] == -1){
                resultArr[resultAsc] = i;
            }
        }

        for(int result : resultArr){
            bw.write(String.valueOf(result) + " ");
        }
        bw.close();
    }
}
