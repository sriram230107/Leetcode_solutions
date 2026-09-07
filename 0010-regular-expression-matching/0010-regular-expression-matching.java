class Solution {
    public boolean isMatch(String s,String p){
        return match(s,p,0,0);
    }

    public boolean match(String s,String p,int i,int j){
        if(j==p.length()){
            return i==s.length();
        }

        boolean firstMatch=i<s.length() &&
            (s.charAt(i)==p.charAt(j)||p.charAt(j)=='.');

        if(j+1<p.length()&&p.charAt(j+1)=='*'){
            if(match(s,p,i,j+2)){
                return true;
            }

            if(firstMatch&&match(s,p,i+1,j)){
                return true;
            }

            return false;
        }

        if(firstMatch){
            return match(s,p,i+1,j+1);
        }

        return false;
    }
}