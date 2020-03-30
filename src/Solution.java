class Solution {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        StringBuffer sb = new StringBuffer(s);
        String topn = s.substring(0, n);
        for (int i = 0; i < len-n; i++){
            sb.setCharAt(i, sb.charAt(i+n));
        }
        for (int j = len-n, k = 0; j < len; j++, k++){
            sb.setCharAt(j, topn.charAt(k));
        }
        return sb.toString();
    }
}