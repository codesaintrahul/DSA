class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        String ans="";

        for(int i=0;i<n;i++){
            String words="";
            while(i<n && sb.charAt(i)!=' '){
                words+=sb.charAt(i);
                i++;
            }
            words=new StringBuilder(words).reverse().toString();
            if(words.length()>0){
                ans+=" "+words;
            }
            
        }
        return ans.substring(1);

    }
}