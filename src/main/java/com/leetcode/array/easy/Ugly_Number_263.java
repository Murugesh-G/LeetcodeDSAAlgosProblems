package com.leetcode.array.easy;

public class Ugly_Number_263 {
    public static void main(String[] args) {
        Ugly_Number_263 obj=new Ugly_Number_263();
        System.out.println(obj.isUgly(7));
    }
    public boolean isUgly(int n) {
        int[] arr={2,3,5};
        if(n<=0)
            return false;
        if(n==1)
            return true;
        for(int num : arr){
            while(n%num == 0)
                n/=num;
        }
        return n==1;
    }
}
