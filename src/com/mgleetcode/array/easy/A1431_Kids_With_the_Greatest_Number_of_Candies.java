package com.mgleetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class A1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        A1431_Kids_With_the_Greatest_Number_of_Candies obj = new A1431_Kids_With_the_Greatest_Number_of_Candies();
        int[] arr = new int[]{12,1,12};
        int exraCandie = 10;
        System.out.println(obj.kidsWithCandies(arr, exraCandie));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : candies) {
            if (num>maxValue) {
                maxValue=num;
            }
        }
        List<Boolean> res = new ArrayList();
        for (int num : candies) {
            if ((num+extraCandies) >= maxValue) {
                 res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
