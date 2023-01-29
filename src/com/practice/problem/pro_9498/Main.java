package com.practice.problem.pro_9498;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine().trim());

        if(input >= 90){
            bw.write("A");
        } else if (input >= 80) {
            bw.write("B");
        } else if (input >= 70){
            bw.write("C");
        } else if (input >= 60){
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.close();
    }
}