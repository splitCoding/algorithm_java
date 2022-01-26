package programmers;

import java.util.*;

public class Problem_42577 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(new Solution().solution(new String[]{"123", "456", "789"}));
        System.out.println(new Solution().solution(new String[]{"12", "123", "1235", "567", "88"}));
    }

    static class Solution {
        boolean solution(String[] phone_book) {
            Arrays.sort(phone_book, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length() == o2.length())
                        return o1.compareTo(o2);
                    return o1.length() - o2.length();
                }
            });
            HashSet<String> check = new HashSet<String>(phone_book.length);
            return true;
        }
    }
}
