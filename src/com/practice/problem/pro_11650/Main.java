package com.practice.problem.pro_11650;

import java.io.*;
import java.util.Arrays;

public class Main {

    /**
     * 1. 입력될 좌표의 개수를 받는다
     * 2. 그 숫자만큼 반복문을 돌려 각 좌표들을 입력 받는다.
     * 3. Arrays 객체의 sort 메서드를 활용한다.
     * ** Arrays 객체의 sort 메서드는 Quicksort를 사용하고 있으며, 평균 nlogn의 시간복잡도를 갖는다.
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());

        int[][] resultArr = new int[inputNumber][2];

        String[] tempArr;

        /** 개수만큼 2차원 배열로 입력 받기 */
        for(int i = 0; i < inputNumber; i++){

            tempArr = br.readLine().split(" ");

            resultArr[i][0] = Integer.parseInt(tempArr[0]);
            resultArr[i][1] = Integer.parseInt(tempArr[1]);

        }

        /** Arrays 객체의 sort 메소드를 활용하여 정렬 */
        Arrays.sort(resultArr, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else{
                return Integer.compare(o1[0], o2[0]);
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int j = 0; j < resultArr.length; j++){
            bw.write(resultArr[j][0] + " " + resultArr[j][1] + "\n");
        }
        bw.close();
    }
}
