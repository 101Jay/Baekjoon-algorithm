package com.practice.problem.pro_1654;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * 매개변수 탐색 - 이진 탐색을 활용한다.
     * start, end를 설정한다.
     *  - start는 답이 될 수 있는 가장 작은 수인 1로 초기화
     *  - end는 답이 될 수 없는 수 중 작은 수를 만들기 위해 모든 입력 값을 더한 뒤, 이를 랜선의 갯수로 나눈 몫에 1을 더하여 구한다.
     * mid 값을 테스트하여, 가능하면 start에, 실패하면 end에 그 값을 대입한다.
     *  - mid는 inputNum만큼 반복문을 돌려 입력 값들을 mid로 나눈 몫을 랜선테스트 변수에 누적하고, 이를 처음 제시된 랜선 갯수와 비교하여 테스트한다.
     * mid 값이 start 값과 같아지면 탈출한다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());
        int lanNum = Integer.parseInt(st.nextToken());

        long startLength = 1;
        long endLength = 0;

        // 배열 선언 및 초기화
        int[] inputArr = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            inputArr[i] = Integer.parseInt(br.readLine());
            endLength += inputArr[i];
        }

        // lanNum이 1일 때의 예외처리
        if(lanNum == 1){
            bw.write(String.valueOf(inputArr[0]));
            bw.close();
            return;
        }


        endLength = endLength / lanNum + 1;
        int lanNumTest = 0;

        while(true){
            long midLength = (startLength + endLength) / 2;

            lanNumTest = 0;
            // mid 값이 가능한지 아닌지 테스트
            for(int i = 0; i < inputArr.length; i++){
                lanNumTest += inputArr[i] / midLength;
            }

            if(midLength == startLength){
                break;
            }

            if(lanNumTest >= lanNum){
                startLength = midLength;
            } else{
                endLength = midLength;
            }
        }

        bw.write(String.valueOf(startLength));
        bw.close();
    }
}
