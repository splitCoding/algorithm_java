package beakjoon;

public class Problem_15649 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;
    static boolean[] is_used;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
        is_used = new boolean[N + 1];
    }
}
