class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(Character.isUpperCase(a))
            {
                sb.setCharAt(i,(char)(a+32));
            }
        }
        return sb.toString();
    }
}