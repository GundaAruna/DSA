class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int maxlen=1;
        int n=s.length();
        int st=0;
        int end=0;
        //odd length
        for(int i=0;i<n-1;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<n){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;

                }else
                break;

            }
            int len=right-left-1;
            if(len>maxlen){
                maxlen=len;
                st=left+1;
                end=right-1;
            }

        }
        //Even length

        for(int i=0;i<n-1;i++){
            int left=i;
            int right=i+1;
            while(left>=0 && right<n){
                 if(s.charAt(left) == s.charAt(right)){
                
                    left--;
                    right++;

                }else
                break;

            }
            int len=right-left-1;
            if(len>maxlen){
                maxlen=len;
                st=left+1;
                end=right-1;
            }

        }
        return s.substring(st,end+1);

        
        
    }

}
