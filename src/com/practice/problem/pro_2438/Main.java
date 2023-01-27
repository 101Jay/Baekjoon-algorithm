package com.practice.problem.pro_2438;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());

        for(int i = 0; i < inputNum; i++){
            String result = new String(new char[i+1]).replace("\0", "*");
            bw.write(result + "\n");
        }
        bw.close();
    }
}
