package com.practice.problem.pro_11650;

import java.io.*;

public class Main {

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
        int cmpPosX = resultArr[0][0] = -100001;
        int cmpPosY = resultArr[0][1] = -100001;

        String[] tempArr;

        int curPos;

        for(int i = 1; i <= inputNumber; i++){

            curPos = i;

            tempArr = br.readLine().split(" ");

            while(Integer.parseInt(tempArr[0]) <= cmpPosX){

                if(Integer.parseInt(tempArr[0]) == cmpPosX){

                    /** Y좌표를 기준으로 비교 -> 크거나 같으면 앞으로 당길 필요가 없음 : break*/
                    if(Integer.parseInt(tempArr[1]) >= cmpPosY){
                        break;
                    }
                }

                /** 현재 위치와 비교 위치를 한 칸 앞당김 -> bubble sort */
                curPos--;
                cmpPosX = resultArr[curPos - 1][0];
                cmpPosY = resultArr[curPos - 1][1];
            }

            /** 현재 저장 위치로부터 한 칸씩 밀어서 저장 */
            for(int k = i; k > curPos; k--){

                resultArr[k][0] = resultArr[k-1][0];
                resultArr[k][1] = resultArr[k-1][1];
            }

            /** 앞서 비교를 통해 정해진 위치에 새로운 좌표를 저장 */
            resultArr[curPos][0] = Integer.parseInt(tempArr[0]);
            resultArr[curPos][1] = Integer.parseInt(tempArr[1]);

            /** 이후 비교를 위한 비교 위치 변경 */
            cmpPosX = resultArr[i][0];
            cmpPosY = resultArr[i][1];

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int j = 1; j < resultArr.length; j++){
            bw.write(resultArr[j][0] + " " + resultArr[j][1] + "\n");
        }
        bw.close();
    }
}
