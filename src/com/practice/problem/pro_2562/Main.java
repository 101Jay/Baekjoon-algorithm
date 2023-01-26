package com.practice.problem.pro_2562;

import java.io.*;

public class Main {

    /**
     * 100보다 작은 서로 다른 자연수들 9개 중 최댓값과 이 값이 몇 번째 수인지 출력.
     * 반복문을 활용한다.
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxVal = Integer.parseInt(br.readLine());
        int maxIndex = 1;
        int curVal;
        for(int i = 2; i < 10; i++){
            curVal = Integer.parseInt(br.readLine());
            if(curVal > maxVal){
                maxVal = curVal;
                maxIndex = i;
            }
        }

        bw.write(String.valueOf(maxVal) + "\n" + String.valueOf(maxIndex));
        bw.close();
    }
}
