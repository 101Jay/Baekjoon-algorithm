package com.practice.problem.pro_3052;

import java.io.*;
import java.util.Arrays;

public class Main {

    /**
     * 1. 10번을 반복하여 수를 입력 받고, 이를 42로 나눈 나머지를 구해 배열에 저장한다.
     * 2. 배열을 정렬한 뒤, 숫자가 바뀌는 횟수를 기록한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] divisionArr = new int[10];
        for(int i = 0; i < 10; i++){
            divisionArr[i] = Integer.parseInt(br.readLine().trim()) % 42;
        }

        Arrays.sort(divisionArr);
        int beforeVal = divisionArr[0];
        int result = 1;
        for(int i = 1; i < 10; i++){
            if(beforeVal != divisionArr[i]){
                result++;
                beforeVal = divisionArr[i];
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
