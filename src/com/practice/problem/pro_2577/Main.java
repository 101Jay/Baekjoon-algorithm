package com.practice.problem.pro_2577;

import java.io.*;

public class Main {

    /**
     * 1. 세 숫자들을 입력 받아 곱한다.
     * 2. 결과를 저장할 배열을 만든다. (배열의 각 인덱스는 해당 숫자가 몇 번 나왔는지 저장할 위치다.)
     * 3. 곱한 숫자를 문자 배열로 변경해 반복문을 돌며 결과 배열에 각 숫자의 인덱스 값을 1씩 추가한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int multipleVal = 1;
        for(int i = 0 ; i < 3; i++){
            multipleVal *= Integer.parseInt(br.readLine().trim());
        }

        int[] resultArr = new int[10];

        char[] charArr = String.valueOf(multipleVal).toCharArray();
        for(char charVal : charArr){
            resultArr[Integer.parseInt(String.valueOf(charVal))]++;
        }

        for(int result : resultArr){
            bw.write(String.valueOf(result) + "\n");
        }

        bw.close();
    }
}
