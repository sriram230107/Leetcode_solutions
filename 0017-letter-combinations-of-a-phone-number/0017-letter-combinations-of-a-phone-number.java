class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();

        if(digits.length()==0) {
            return ans;
        }

        String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        generate(digits,0,"",letters,ans);

        return ans;
    }

    public void generate(String digits,int index,String s,String[] letters,List<String> ans) {
        if(index==digits.length()) {
            ans.add(s);
            return;
        }

        String current=letters[digits.charAt(index)-'0'];

        for(int i=0;i<current.length();i++) {
            generate(digits,index+1,s+current.charAt(i),letters,ans);
        }
    }
}