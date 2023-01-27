package com.practice.problem.pro_11654;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = br.read();
        bw.write(String.valueOf(result));
        bw.close();
    }
}
