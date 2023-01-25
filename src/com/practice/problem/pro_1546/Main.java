package com.practice.problem.pro_1546;

import java.io.*;

public class Main {

    /**
     * 1. 과목의 갯수를 입력 받는다.
     * 2. 과목의 갯수만큼 반복하여 전체 과목의 점수를 배열에 저장한다.
     * 3. 최댓값을 찾는다.
     * 4. 최댓값을 가지고 점수 / 최대값 * 100 을 하여 새로운 과목별 점수를 구한다.
     * 5. 평균을 구한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        String[] inputStr = br.readLine().trim().split(" ");
        double[] inputVal = new double[inputStr.length];

        double maxVal = Integer.parseInt(inputStr[0]);
        for(int i = 0; i < inputNum; i++){
            inputVal[i] = Integer.parseInt(inputStr[i]);

            if(inputVal[i] > maxVal){
                maxVal = inputVal[i];
            }
        }

        double totalVal = 0;
        for(int i = 0 ; i< inputVal.length; i++){
            inputVal[i] = (inputVal[i] / maxVal) * 100;

            totalVal += inputVal[i];
        }

        double result = totalVal / inputVal.length;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.close();
    }
}
