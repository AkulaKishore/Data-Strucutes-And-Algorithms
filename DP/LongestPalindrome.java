class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";
        for(int i = n-1;i>=0;i--){
            for(int j = i;j<n;j++){
                dp[i][j] = (s.charAt(i)==s.charAt(j) && (j-i<2 || dp[i+1][j-1]));
                if(dp[i][j] && (res =="" ||(j-i+1) > res.length())){
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}

//TIME COMPLEXITY: o(n^2)
//Space Complexity : O(n^2)
// logic:  S(i,j) = S(i+1,j-1) + i==j for a string to be palidromic.