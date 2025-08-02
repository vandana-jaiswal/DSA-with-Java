// solution in lt Q.3
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3


// solution 1
import java.util.HashSet;

class MaxLength1 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(set.contains(c)){
                    max = Math.max(max,set.size());
                    set.clear();
                    i-- ;
            }
            else
                set.add(c);
        }
        return max;
    }
}

