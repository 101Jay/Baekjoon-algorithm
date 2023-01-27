package com.practice.problem.pro_10952;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr;
        String[] inputArr;

        int result;

        while(true){
            inputStr = br.readLine();
            inputArr = inputStr.trim().split(" ");
            result = Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1]);

            if(result == 0){
                break;
            }
            bw.write(String.valueOf(result) + "\n");
        }
        bw.close();
    }
}
