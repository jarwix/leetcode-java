class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'M') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result = result + 900;
                    --i;
                }
                else
                    result = result + 1000;
            } else if (s.charAt(i) == 'D') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result = result + 400;
                    --i;
                }
                else
                    result = result + 500;
            } else if (s.charAt(i) == 'C') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result = result + 90;
                    --i;
                }
                else
                    result = result + 100;
            } else if (s.charAt(i) == 'L') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result = result + 40;
                    --i;
                }
                else
                    result = result + 50;
            } else if (s.charAt(i) == 'X') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result = result + 9;
                    --i;
                }else
                    result = result + 10;

            } else if (s.charAt(i) == 'V') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result = result + 4;
                    --i;
                }
                else
                    result = result + 5;
            } else if (s.charAt(i) == 'I') {
                result = result + 1;
            }
        }
        return result;
    }
}
