package com.practice.problem.pro_2675;

import java.io.*;

public class Main {

    /**
     * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
     * 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
     * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
     *
     * 1. 개수를 입력 받는다.
     * 2. 그 개수만큼 반목문을 돌린다.
     * 3. 반복문 안에서 반복 횟수 R와 문자열 S를 입력 받는다.
     * 4. S의 각 문자들을 R번 반복하여 더한 뒤, 결과 배열에 담아둔다.
     * 5. 출력한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        String[] inputArr;
        int repeatNum;
        String result = "";
        char[] inputS;
        String[] resultArr = new String[inputNum];

        for(int i = 0; i < inputNum; i++){
           inputArr = br.readLine().trim().split(" ");
           repeatNum = Integer.parseInt(inputArr[0]);
           inputS = inputArr[1].toCharArray();

           for(int k = 0; k < inputS.length; k++){
               for(int j = 0; j < repeatNum; j++){
                   result += inputS[k];
               }
           }
           resultArr[i] = result;
           result = "";
        }
        
        for(String resultStr : resultArr){
            bw.write(resultStr + "\n");
        }

        bw.close();
    }
}
