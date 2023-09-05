class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)Math.sqrt(c-(a*a));
        while(a<=(int)Math.sqrt(c) && b<=(int)Math.sqrt(c)){
            if(b*b == c-(a*a) && (a*a)+(b*b) == c) return true;
            a++;
            b = (int)Math.sqrt(c-(a*a));
        }
        return false;
    }
}
