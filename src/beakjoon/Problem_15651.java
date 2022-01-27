package beakjoon;

import java.util.*;
import java.io.*;

public class Problem_15651 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
    }

    static void rec_func(int k) {
        if (k == M) {
            for (int num : selected) sb.append(num).append(" ");
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }
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