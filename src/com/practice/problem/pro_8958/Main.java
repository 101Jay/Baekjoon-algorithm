package com.practice.problem.pro_8958;

import java.io.*;

public class Main {

    /**
     * 1. 테스트 케이스의 개수를 입력 받아, 반복문을 돌린다.
     * 2. 반복문 안에서 입력을 받고, 이를 문자 배열로 바꾼다.
     * 3. O가 나오면 점수를 받되, 연속된 O를 계산하는 변수를 사용해 점수를 판단한다.
     * 4. 결과 점수를 출력한다.
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        String inputStr;
        char[] charArr;
        int successiveO;
        int result;
        for(int i = 0; i < inputNum; i++){
            inputStr = br.readLine();
            charArr = inputStr.toCharArray();

            successiveO = 0;
            result = 0;
            for(char str : charArr){
                if(str == 'O'){
                    successiveO++;
                    result += successiveO;
                }else {
                    successiveO = 0;
                }
            }
            if(i == inputNum -1){
                bw.write(String.valueOf(result));
            } else {
                bw.write(String.valueOf(result) + "\n");
            }
        }
        bw.close();
    }
}
