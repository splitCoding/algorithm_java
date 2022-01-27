package beakjoon;

import java.util.*;
import java.io.*;

public class Problem_15651 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String ret = "";
        try {
            ret += br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }
}