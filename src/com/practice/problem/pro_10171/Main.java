package com.practice.problem.pro_10171;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        bw.write("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");
        // 개 버전
        bw.write("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
        bw.close();
    }
}
