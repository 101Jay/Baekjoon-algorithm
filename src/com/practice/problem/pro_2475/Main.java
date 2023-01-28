package com.practice.problem.pro_2475;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int curVal;
        for(int i = 0; i < 5; i++){
            curVal = Integer.parseInt(st.nextToken());
            result += curVal * curVal;
        }

        result = result % 10;

        bw.write(String.valueOf(result));
        bw.close();
    }
}
