class Solution {
    public boolean isvowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
    public int maxVowels(String s, int k) {
        //char[] carr=s.toCharArr();
        int l=0;
        int r=k;
        int cnt=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                cnt++;
            }
        }
        int maxcnt=cnt;
        while(r<s.length()){
            if(isvowel(s.charAt(l))){
                cnt--;
            }
            if(isvowel(s.charAt(r))){
                cnt++;
            }
            maxcnt=Math.max(maxcnt,cnt);
            l++;
            r++;
        }
        return maxcnt;
    }
}