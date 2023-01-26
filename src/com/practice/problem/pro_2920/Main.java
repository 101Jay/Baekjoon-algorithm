package com.practice.problem.pro_2920;

import java.io.*;

public class Main {

    /**
     * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
     * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
     * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
     *
     * 1. 각 숫자를 배열로 입력 받는다.
     * 2. 반복문을 돌려, 이 숫자가 계속 커지는지, 작아지는지, 둘 다 아닌지 판별한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputArr = br.readLine().trim().split(" ");
        int inputNum = 0;
        int beforeVal = Integer.parseInt(inputArr[0]);

        String beforeStatus = "";
        if(beforeVal == 1){
            beforeStatus = "ascending";
        } else if(beforeVal == 8) {
            beforeStatus = "descending";
        } else{
            // 아니라면 어차피 mix
            bw.write("mixed");
            bw.close();
            return;
        }

        String status = "";

        for(int i = 1; i < inputArr.length; i++){
            inputNum = Integer.parseInt(inputArr[i]);
            if(beforeVal < inputNum){
                status = "ascending";
            } else if (beforeVal > inputNum) {
                status = "descending";
            } else{
                bw.write("mixed");
                bw.close();
                return;
            }

            if(!beforeStatus.equals(status)){
                bw.write("mixed");
                bw.close();
                return;
            }

            beforeStatus = status;
            beforeVal = inputNum;
        }

        bw.write(status);
        bw.close();
    }
}
