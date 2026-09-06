class Solution {
    public int myAtoi(String st) {

        int i = 0;
        int sign = 1;
        long num = 0;

        while (i < st.length() && st.charAt(i) == ' ') {
            i++;
        }

        if (i < st.length() && st.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < st.length() && st.charAt(i) == '+') {
            i++;
        }

        while (i < st.length() && Character.isDigit(st.charAt(i))) {

            num = num * 10 + (st.charAt(i) - '0');

            if (sign == 1 && num > 2147483647)
                return 2147483647;

            if (sign == -1 && num > 2147483648L)
                return -2147483648;

            i++;
        }

        return (int)(num * sign);
    }
}