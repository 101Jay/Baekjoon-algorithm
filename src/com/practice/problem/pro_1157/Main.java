package com.practice.problem.pro_1157;

import java.io.*;
import java.util.Arrays;

public class Main {

    /**
     * 1. 입력을 받는다.
     * 2. 입력 받은 문자열을 알파벳 순으로 정렬한다.
     * 3. 배열을 만들고 알파벳 순으로 해당 문자열의 등장 횟수를 할당한다.
     * 4. 횟수가 가장 많은 것을 뽑는다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine().toLowerCase();
        char[] inputChar = inputString.toCharArray();

        Arrays.sort(inputChar);

        // 알파벳의 갯수만큼 배열의 크기를 설정해 만든다.
        int[] alphabetNum = new int[26];
        // 각 배열의 값을 0으로 초기화한다.
        for(int k = 0; k < alphabetNum.length; k++){
            alphabetNum[k] = 0;
        }

        // curIndex는 문자 배열의 현재 인덱스 위치를 의미한다.
        int curIndex = 0;

        // 문자 배열을 돌면서, 다른 문자로 바뀌기 전까지 해당 위치를 인덱스로 하는 배열의 값을 1씩 늘린다.
        for(int i = 0; i < inputChar.length; i++){
            alphabetNum[curIndex]++;

            // 알파벳이 달라지면 curIndex를 옮겨 다른 문자 위치로 이동한다.
            if(i < inputChar.length - 1 && inputChar[i] != inputChar[i+1]){
                curIndex++;
            }
        }

        int resultIndex = 0;

        // 알파벳의 등장 횟수를 저장한 배열을 돌면서 가장 큰 숫자를 저장하고 있는 인덱스 위치를 저장한다.
        for(int j = 0; j < alphabetNum.length; j++){
            if(alphabetNum[j] > alphabetNum[resultIndex]){
                // resultIndex는 alphabetNum에서의 인덱스 위치
                resultIndex = j;
            }
        }

        // 알파벳의 등장 횟수를 저장한 배열을 돌면서 앞서 저장한 가장 큰 숫자와 같은 숫자를 가진 것이 있는지 확인한다.
        for(int i = 0; i < alphabetNum.length; i++){
            if(alphabetNum[i] == alphabetNum[resultIndex]){
                if(i != resultIndex){
                    // 같은 횟수의 알파벳이 존재한다는 의미임으로 ?를 출력한다.
                    bw.write("?");
                    bw.close();
                    return;
                }
            }
        }

        int alphabetPos = 0;
        // alphabetNum에서의 resultIndex 위치가 inputChar 배열에서 어느 위치에 있는지를 파악
        for(int i = 0; i < resultIndex; i++){
            alphabetPos += alphabetNum[i];
        }

        bw.write(String.valueOf(inputChar[alphabetPos]).toUpperCase());
        bw.close();
    }
}
