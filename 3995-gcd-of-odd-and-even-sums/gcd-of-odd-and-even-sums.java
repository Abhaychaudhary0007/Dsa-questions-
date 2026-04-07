class Solution {
    public int gcd(int a,int b){
      if(Math.min(a,b)==0){
        return Math.max(a,b);
      }
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        return gcd(odd,even);
    }
}