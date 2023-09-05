class Solution {
    public String convertToTitle(int c) {
        String ans = "";
        while(c > 0){
            ans = String.valueOf((char)(((c-1)%26)+'A')) + ans;
            c = c/26;
        }
        return ans;
    }

}
