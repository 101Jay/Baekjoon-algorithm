package com.practice.problem.pro_1181;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    /**
     * 단어의 개수를 입력 받아 반복문을 돌린다.
     * String 배열로 단어를 입력한다.
     * 선택 정렬을 사용해보자
     *      1. 반복문을 돌려 최소값을 찾는다.
     *      2. 최소값을 배열의 가장 앞자리에 가져다 둔다.
     *      3. 가장 앞자리를 제외한 배열을 가지고 위의 행위를 반복한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        String[] strArr = new String[inputNum];
        for(int i = 0; i < inputNum; i++){
            strArr[i] = br.readLine().trim();
        }

        // 정렬
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        // 출력 -> 동일한 단어가 연속으로 나올 경우 하나만 출력
        String beforeVal = null;
        for(String result : strArr){
            if(result.equals(beforeVal)){
                // 출력하지 않음
                continue;
            }
            bw.write(result + "\n");
            beforeVal = result;
        }
        bw.close();
    }
}
