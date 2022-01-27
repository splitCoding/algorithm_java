package programmers;

import java.util.*;

public class Problem_42578 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(new Solution().solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    static class Solution {
        public int solution(String[][] clothes) {
            int ret = 1;
            HashMap<String, Integer> check = new HashMap<String, Integer>(clothes.length);
            for (String[] cloth : clothes) {
                check.merge(cloth[1], 1, (existValue, addValue) -> (existValue + addValue));
            }
            if (check.size() == 1) {
                return clothes.length;
            } else {
                for (int value : check.values())
                    ret *= value + 1;
            }
            return ret - 1;
        }
    }
}
