class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstWord = strs[0];

        for (int i = 0; i < firstWord.length(); i++) {
            char currentChar = firstWord.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // Return prefix if we hit end of word or find character mismatch
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return firstWord.substring(0, i);
                }
            }
        }

        return firstWord;
    }
}