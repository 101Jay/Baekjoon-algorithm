package com.practice.problem.pro_1259;

import java.io.*;

public class Main {

    /**
     * 각 테스트 케이스를 입력으로 받는다.
     * 입력을 문자 배열로 받아 길이를 구하고, 길이의 절반을 기준으로 앞 뒤로 좁혀오며 같은 수인지 비교한다.
     * 중간에 다른 수가 하나라도 있다면 빠져나온다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(Integer.parseInt(input = br.readLine()) != 0){
            char[] inputVal = input.toCharArray();

            int length = inputVal.length;
            int half = length / 2;

            if(half == 0){
                bw.write("yes\n");
            } else{
                for(int i = 0; i < half; i++){
                    if(inputVal[i] != inputVal[length - 1 - i]){
                        bw.write("no\n");
                        break;
                    }

                    if(i == half - 1){
                        bw.write("yes\n");
                    }
                }
            }
        }
        bw.close();
    }
}
