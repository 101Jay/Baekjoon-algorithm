package com.practice.problem.pro_2908;

import java.io.*;

public class Main {

    /**
     * 1. 두 수를 문자열로 일의 자리와 백의 자리를 서로 바꾼다.
     * 2. 크기를 비교한다.
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNum = br.readLine().trim().split(" ");
        int firstNum = Integer.parseInt(inputNum[0]);
        int secondNum = Integer.parseInt(inputNum[1]);

        firstNum = (firstNum % 10) * 100 + (firstNum % 100 - firstNum % 10) + firstNum / 100;
        secondNum = (secondNum % 10) * 100 + (secondNum % 100 - secondNum % 10) + secondNum / 100;

        if(firstNum > secondNum){
            bw.write(String.valueOf(firstNum));
        } else{
            bw.write(String.valueOf(secondNum));
        }

        bw.close();
    }
}
