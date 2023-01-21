package com.practice.problem.pro_1463;

import java.io.*;

public class Main {

    /**
     * Dynamic Programming
     * 재귀를 이용해서 풀어보자.
     * */
    static Integer[] intArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        intArr = new Integer[inputNum + 1];
        intArr[0] = intArr[1] = 0;

        /** Depth가 깊어질 수록 실행 속도가 느려지는 모습을 보임 -> Depth를 줄이는 과정 */
        for(int i = 0; i <= inputNum - 1; i++){
            recursiveFunction(i);
        }

        int result = recursiveFunction(inputNum);

        bw.write(String.valueOf(result));
        bw.close();
    }

    public static int recursiveFunction(int num){

        if(intArr[num] == null){
            if(num % 2 == 0){
                if(num % 3 == 0){
                    intArr[num] = findMinValueOfThree(recursiveFunction(num / 3), recursiveFunction(num / 2), recursiveFunction(num - 1)) + 1;
                } else{
                    intArr[num] = findMinValueOfTwo(recursiveFunction(num / 2), recursiveFunction(num - 1)) + 1;
                }
            } else if (num % 3 == 0) {
                intArr[num] = findMinValueOfTwo(recursiveFunction(num / 3), recursiveFunction(num - 1)) + 1;
            } else{
                intArr[num] = recursiveFunction(num - 1) + 1;
            }
        }

        return intArr[num];
    }

    public static int findMinValueOfTwo(int num1, int num2){
        return num1 > num2 ? num2 : num1;
    }

    public static int findMinValueOfThree(int num1, int num2, int num3){
        return findMinValueOfTwo(findMinValueOfTwo(num1, num2), num3);
    }

}
