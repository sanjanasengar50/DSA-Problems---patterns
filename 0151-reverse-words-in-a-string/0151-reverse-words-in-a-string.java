class Solution {
    public String reverseWords(String s) {

        String[] words = new String[s.length()];
        int count = 0;

        int i = 0;

        // Extract words manually
        while (i < s.length()) {

            // Skip spaces
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            if (i == s.length()) {
                break;
            }

            String word = "";

            // Build the current word
            while (i < s.length() && s.charAt(i) != ' ') {
                word = word + s.charAt(i);
                i++;
            }

            words[count] = word;
            count++;
        }

        // Reverse words manually
        String result = "";

        for (int j = count - 1; j >= 0; j--) {

            result = result + words[j];

            if (j != 0) {
                result = result + " ";
            }
        }

        return result;
    }
}