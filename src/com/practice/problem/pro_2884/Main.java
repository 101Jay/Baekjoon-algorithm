package com.practice.problem.pro_2884;

import java.io.*;

public class Main {
    // 1. 입력 받은 수를 두 개의 숫자로 분류
    // 2. 두 번째 숫자가 45보다 크다면 -45 한 값을 출력
    // 3. 두 번째 숫자가 45보다 작다면 60에서 45를 뺀 숫자를 그 숫자와 더한다.
    // 4. 첫 번째 숫자를 -1 한뒤 출력한다.
    // 첫 번째 숫자가 0일 경우 24로 바꾼 뒤 -1을 진행한다.

    public static void main(String[] args) throws IOException {

        /** 1. 입력 받은 수를 두 개의 숫자로 분류 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = br.readLine();

        String[] inputArr = inputValue.split(" ");

        int hour = Integer.parseInt(inputArr[0]);
        int min = Integer.parseInt(inputArr[1]);

        /** 2. 두 번째 숫자가 45보다 크다면 -45 한 값을 출력 */
        if(min >= 45){
            min = min - 45;
        } else{
            /** 3. 두 번째 숫자가 45보다 작다면 60에서 45를 뺀 숫자를 그 숫자와 더한다. */
            min = min + (60 - 45);
            /** 4. 첫 번째 숫자를 -1 한다. */
            hour = hour - 1;
        }

        /** 단, 첫 번째 숫자가 0일 경우 24로 바꾼 뒤 -1을 진행한다. */
        if(hour == -1){
            hour = 23;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(hour + " " + min);
        bw.close();
    }
}