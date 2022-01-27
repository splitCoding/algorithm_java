package beakjoon;

public class Problem_15649 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;
    static boolean[] is_used;

    static void input() {
        FastReader scan = new FastReader(); //Problem_15651 브랜치에 코드 소스 존재
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
        is_used = new boolean[N + 1];
    }

    static void rec_func(int k) {
        if (k == M) {
            for (int num : selected) sb.append(num).append(" ");
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                if (!is_used[cand]) {
                    selected[k] = cand;
                    is_used[cand] = true;
                    rec_func(k + 1);
                    selected[k] = 0;
                    is_used[cand] = false;
                }
            }
        }
    }
}
