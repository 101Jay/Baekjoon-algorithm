package com.practice.problem.pro_1436;

import java.io.*;

public class Main {

    /**
     * 숫자 N을 입력 받는다.
     * 1부터 10,000까지 반복문을 돌린다.
     * 반복문마다 666이 연속으로 들어가 있는지 확인한다.
     * 해당할 때마다 cnt를 늘린다.
     * cnt가 N이 되는 순간의 수를 출력한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 1; i < 10000666; i++){
            char[] input = String.valueOf(i).toCharArray();

            int sixCnt = 0;
            char before = input[input.length-1];
            if(before == '6'){
                sixCnt++;
            }

            // 6이 연속으로 들어간 것인지 체크
            for(int j = input.length - 2; j >= 0; j--){

                if(before == '6' && input[j] == '6'){
                    if(j > 0 && input[j-1] == '6'){
                        cnt ++;
                        break;
                    }
                }

                before = input[j];
            }

            if(cnt == inputNum){
                bw.write(String.valueOf(i));
                bw.close();
                return;
            }
        }
    }
}
