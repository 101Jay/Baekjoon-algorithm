package com.practice.problem.pro_10818;

import java.io.*;

public class Main {
    /**
     * 1. 첫 째줄의 입력만큼 while문을 활용한다.
     * 2. 그 중 가장 큰 수와 작은 수를 저장한 뒤 출력한다. */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] inputNum = br.readLine().split(" ");

        int arrNum = 0;
        int min = Integer.parseInt(inputNum[arrNum]);
        int max = Integer.parseInt(inputNum[arrNum]);

        int cur;

        while(num >= 1){
            cur = Integer.parseInt(inputNum[arrNum]);
            if(min > cur){
                min = cur;
            }
            if(max < cur){
                max = cur;
            }

            arrNum++;
            num--;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(min + " " + max);
        bw.close();
    }
}
