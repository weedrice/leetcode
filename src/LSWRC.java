import java.util.HashMap;
import java.util.Map;

public class LSWRC {
    public void main(String[] args) {
        String testCase = "abcabcbb";
        String testCase2 = "bbbbb";
        String testCase3 = "pwwkew";
        String testcase4 = "aab";
        String testCase5 = "dvdf";
        String testcase6 = " ";
        String testCase7 = "au";
        System.out.println("lengthOfLongestSubstring(testCase) = " + lengthOfLongestSubstring(testCase));
        System.out.println("lengthOfLongestSubstring(testCase2) = " + lengthOfLongestSubstring(testCase2));
        System.out.println("lengthOfLongestSubstring(testCase3) = " + lengthOfLongestSubstring(testCase3));
        System.out.println("lengthOfLongestSubstring(testcase4) = " + lengthOfLongestSubstring(testcase4));
        System.out.println("lengthOfLongestSubstring(testCase5) = " + lengthOfLongestSubstring(testCase5));
        System.out.println("lengthOfLongestSubstring(testcase6) = " + lengthOfLongestSubstring(testcase6));
        System.out.println("lengthOfLongestSubstring(testCase7) = " + lengthOfLongestSubstring(testCase7));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
