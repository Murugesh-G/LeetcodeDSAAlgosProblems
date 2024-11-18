package com.mgleetcode.array.easy;

public class LC263_Ugly_Number {
    public static void main(String[] args) {
        LC263_Ugly_Number obj=new LC263_Ugly_Number();
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
