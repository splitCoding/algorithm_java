package beakjoon;

public class Problem_15650 extends Problem_15649 {
    static void rec_func(int k) {
        if (k == M) {
            for (int num : selected) sb.append(num).append(" ");
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                if (k > 0 && selected[k - 1] > cand) continue;
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
