package com.practice.problem.pro_2439;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());

        for(int i = 0; i < inputNum; i++){
            char[] result = new char[inputNum];

            for(int j = 0; j < i+1; j++ ){
                result[inputNum-j-1] = '*';
            }

            bw.write(String.valueOf(result).replace("\0", " ") + "\n");
        }
        bw.close();
    }
}
