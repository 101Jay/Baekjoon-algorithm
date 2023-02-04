package com.practice.problem.pro_2292;

import java.io.*;

public class Main {

    /**
     * 옆 집으로 가기 위해선 6씩 커지는 울타리를 지나야한다.
     * 가장 빠른 길은 그 울타리의 갯수.
     * 1. 가야하는 집의 번호를 입력 받는다.
     * 2. 그 번호가 어떤 울타리에 있는지 확인한다.
     *      - 기준이 되는 수는 1부터 누적해서 더해진다.
     *      - 누적해서 더해지는 크기는 6씩 커진다. ( 6-> 12 -> 18 ..)
     *      - 즉, 기준이 되는 수는 1, 7, 19, 37... 식으로 증가한다.
     * 3. 해당 울타리가 몇 번째 울타리인지 구한다.
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());
        int boundNum = 1;
        int addNum = 6;

        int boundIndex = 1;

        while(inputNum > boundNum){
            boundNum += addNum;
            addNum += 6;
            boundIndex ++;
        }

        bw.write(String.valueOf(boundIndex));
        bw.close();
    }
}
