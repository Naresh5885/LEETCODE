class Solution {
    public String convertToTitle(int n) {
       StringBuilder sb=new StringBuilder();
       while(n>0)
       {
        n--;
        int a=n%26;
        n=n/26;
        sb.append((char)(a+'A'));
       } 
       return sb.reverse().toString();
    }
}