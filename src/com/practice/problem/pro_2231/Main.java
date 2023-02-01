package com.practice.problem.pro_2231;

import java.io.*;

public class Main {
    /**
     * 1. 입력을 받은 뒤, 그 입력까지 오는 모든 수까지를 점검한다.
     * 2. 각 숫자들의 분해합을 구해본 뒤, 분해합이 256인지 확인한다.
     * 3. 해당하는 숫자를 갱신하며 최소값을 구한다.
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        int result = 1000001;
        int sum;
        int divsum;
        for(int i = 0; i < inputNum; i++){
            sum = i;
            divsum = sum;

            divsum += sum % 10;

            while(sum >= 10){
                sum = sum / 10;
                divsum += sum % 10;
            }

            if(divsum == inputNum && i < result){
                result = i;
            }
        }

        if(result == 1000001){
            result = 0;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
