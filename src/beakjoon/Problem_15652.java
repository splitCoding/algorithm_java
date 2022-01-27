package beakjoon;

public class Problem_15652 extends Problem_15651 {
    static void rec_func(int k) {
        if (k == M) {
            for (int num : selected) sb.append(num).append(" ");
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                if (k > 0 && selected[k - 1] > i) continue;
                selected[k] = i;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }
}