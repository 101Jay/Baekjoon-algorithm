package com.practice.problem.pro_2751;

import java.io.*;
import java.util.Arrays;

public class Main {
    
    /** 
     * 입력 : -1000000 ~ 1000000, 중복 안 됨
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int inputNum = Integer.parseInt(br.readLine());
        int[] inputArr = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(inputArr);
        for(int i : inputArr){
            bw.write(String.valueOf(i) + "\n");
        }
        bw.close();
    }
}
