package com.leetcode.array.medium;

public class Count_Primes_204 {
    /*
 - Using seive od ertosthenis
 - Pick a number check its prime and do multiple of it, mark as composite
 - Start of prime number check from i*i
 - End of prime number check till square root of i
*/
    public static void main(String[] args) {
        Count_Primes_204 obj = new Count_Primes_204();
        int n=2;
        System.out.println("Result is "+obj.countPrimes(n));
    }

    public int countPrimes(int n) {
       boolean[] seen=new boolean[n];
       int ans=0;

       for(int i=2;i<n;i++){
           if(seen[i]) continue;
           ans++;
           for(long j=(long)i*i;j<n;j+=i){
               seen[(int)j]=true;
           }
       }
       return ans;
    }
}
