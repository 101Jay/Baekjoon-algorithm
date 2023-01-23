package com.practice.problem.pro_11650;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main_sort {

    /**
     * 1. 입력될 좌표의 개수를 받는다
     * 2. 그 숫자만큼 반복문을 돌려 각 좌표들을 입력 받는다.
     * 3. 각 좌표를 순서대로 배열에 넣되, 앞 순서의 숫자보다 x 좌표가 음의 영역에 가깝다면, 즉 x좌표의 수가 더 작다면 이전 수를 현재 수로 바꾸고 기존의 자리를 차지한다.
     * 시간초과의 이유?
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());

        /** 추후 비교를 위한 초기값 설정 */
        int[][] resultArr = new int[inputNumber + 1][2];

        /** 첫 번째 비교 대상의 위치의 좌표(현재 좌표보다 하나 전)*/
        resultArr[0][0] = -100001;
        resultArr[0][1] = -100001;

        String[] tempArr;


        for(int i = 1; i <= inputNumber; i++){

            tempArr = br.readLine().split(" ");
            resultArr[i][0] = Integer.parseInt(tempArr[0]);
            resultArr[i][1] = Integer.parseInt(tempArr[1]);

            Arrays.sort(resultArr, new Comparator<int[]>(){
                @Override
                public int compare(int[] a1, int[] a2){
//                    if(a1[0] == a2[0]){
//                        return a1[1] - a2[1];
//                    }
                    return a1[0] - a2[0];
                }
            });
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int j = 0; j < resultArr.length; j++){
            bw.write(resultArr[j][0] + " " + resultArr[j][1] + "\n");
        }
        bw.close();
    }
}
