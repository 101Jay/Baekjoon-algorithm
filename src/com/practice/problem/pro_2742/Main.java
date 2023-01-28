package com.practice.problem.pro_2742;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i< inputNum; i++){
            bw.write(String.valueOf(inputNum - i) + "\n");
        }

        bw.close();
    }
}
