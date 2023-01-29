package com.practice.problem.pro_10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNum = Integer.parseInt(st.nextToken());
        int compareNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < inputNum; i++){
            int inputVal = Integer.parseInt(st.nextToken());
            if(inputVal < compareNum){
                bw.write(String.valueOf(inputVal) + " ");
            }
        }
        bw.close();
    }
}
