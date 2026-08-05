import java.util.HashMap;
class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int have = 0;
        int need = tMap.size();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (tMap.containsKey(ch) &&
                windowMap.get(ch).intValue() == tMap.get(ch).intValue()) {

                have++;
            }

            while (have == need) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) < tMap.get(leftChar)) {

                    have--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}