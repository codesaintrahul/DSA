class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int c:t.toCharArray()){
            freq[c - 'a']--;
        }
        for(int cnt: freq){
            if(cnt!=0){
                return false;
            }
            
        }
        return true;
        
    }
}