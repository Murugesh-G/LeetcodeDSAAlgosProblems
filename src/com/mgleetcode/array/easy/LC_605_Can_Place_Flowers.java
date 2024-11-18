package com.mgleetcode.array.easy;

public class LC_605_Can_Place_Flowers {
    public static void main(String[] args) {
        LC_605_Can_Place_Flowers obj = new LC_605_Can_Place_Flowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(obj.canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
