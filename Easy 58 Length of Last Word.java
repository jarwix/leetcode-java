class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        int i = s.length() - 1;
        while (s.charAt(i) == ' ')
            i--;
        for (;;i--){
            if (i == 0)
                return ++k;
            if (s.charAt(i) == ' ')
                return k;
            k++;
        }
    }
}
