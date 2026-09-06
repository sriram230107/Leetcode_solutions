class Solution {
    public String convert(String s, int R) {

        if (R == 1 || R >= s.length()) {
            return s;
        }

        String row[] = new String[R];

        for (int i = 0; i < R; i++) {
            row[i] = "";
        }

        int r = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); i++) {

            row[r] += s.charAt(i);

            if (r == R - 1) {
                down = false;
            }

            if (r == 0) {
                down = true;
            }

            if (down) {
                r++;
            } else {
                r--;
            }
        }

        String ans = "";

        for (int i = 0; i < R; i++) {
            ans += row[i];
        }

        return ans;
    }
}