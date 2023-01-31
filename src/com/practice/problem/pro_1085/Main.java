package com.practice.problem.pro_1085;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * 현재 좌표 x,y, w,h 를 입력 받는다.
     * x, y, (w-x), (h-y) 중 가장 작은 값을 출력한다.
     * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int result = findMinVal(x, y, w-x, h-y);

        bw.write(String.valueOf(result));
        bw.close();
    }

    private static int findMinVal(int a, int b, int c, int d) {
        int semiResult = a > b ? b : a;
        int semiResult2 = c > d ? d : c;

        return semiResult > semiResult2 ? semiResult2 : semiResult;
    }

}
