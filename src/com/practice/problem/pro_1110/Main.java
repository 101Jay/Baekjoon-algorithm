package com.practice.problem.pro_1110;

import java.io.*;

import static java.lang.String.valueOf;

public class Main {

    /**
     * 1. 입력 받은 수가 한 자리라면 10을 곱해 두 자리 수로 만든다
     * 2. while문을 활용해 사이클을 반복한다.(처음 수가 다시 나오면 반복문을 탈출한다.)
     * 3. 사이클 반복 횟수를 기록하고 있다가, 이를 출력한다.
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        if(inputNum < 10){
            inputNum *= 10;
        }

        int initNum = inputNum;

        /** 1회차 사이클 */
        inputNum = (inputNum % 10) * 10 + (  (inputNum / 10 + inputNum % 10) % 10);
        int cycleNum = 1;

        while(inputNum != initNum){
            inputNum = (inputNum % 10) * 10 + (  (inputNum / 10 + inputNum % 10) % 10);
            cycleNum++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write( valueOf(cycleNum));
        bw.close();
    }
}
