import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s==null || s.length()==0) return 0;
        if (s.length()==1) return 1;
        HashSet<Character> set = new HashSet<Character>();
        char[] chars = s.toCharArray();
        int max=1;
        String current;
        for (int i = 0; i < chars.length-1; i++) {
            set.clear();
            int currentMax=0;
            for (int j = i; j < chars.length; j++) {
                if (!set.contains(chars[j])){
                    set.add(chars[j]);
                    currentMax++;
                } else
                    break;

            }
            if (max<currentMax) max=currentMax;
        }
        return max;
    }
}