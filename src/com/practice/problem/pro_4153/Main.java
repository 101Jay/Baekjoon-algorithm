package com.practice.problem.pro_4153;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int[] inputArr = new int[4];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; i++){
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        while(inputArr[0] > 0){

            findMaxVal(inputArr);
            if(inputArr[3] == 0){
                if(inputArr[0] * inputArr[0] == inputArr[1] * inputArr[1] + inputArr[2] * inputArr[2]){
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            } else if (inputArr[3] == 1) {
                if(inputArr[1] * inputArr[1] == inputArr[0] * inputArr[0] + inputArr[2] * inputArr[2]){
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            } else {
                if(inputArr[2] * inputArr[2] == inputArr[0] * inputArr[0] + inputArr[1] * inputArr[1]){
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                inputArr[i] = Integer.parseInt(st.nextToken());
            }
        }
        bw.close();
    }

    private static void findMaxVal(int[] index) {
        int first = index[0];
        int second = index[1];
        int third = index[2];

        if(first > second){
            if(first > third){
                index[3] = 0;
            } else{
                index[3] = 2;
            }
        } else{
            if(second > third){
                index[3] = 1;
            } else{
                index[3] = 2;
            }
        }
    }
}
