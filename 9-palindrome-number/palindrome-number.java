class Solution {
    public boolean isPalindrome(int n) {
        int s=0;
        int m=n;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;

        }
        return s==m;

    }
}