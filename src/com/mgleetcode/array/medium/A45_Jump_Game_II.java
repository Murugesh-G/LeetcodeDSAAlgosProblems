package com.mgleetcode.array.medium;

public class A45_Jump_Game_II {
    public static void main(String[] args) {
        A45_Jump_Game_II obj = new A45_Jump_Game_II();
        int[] nums = {2,3,1,1,4};
        System.out.println(obj.jump(nums));
    }

    public int jump(int[] nums) {
        int reachable = 0, count = 0;
        if(nums.length==1){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (reachable < i + nums[i]) {
                reachable = i + nums[i];
                count++;
                if(reachable>nums.length-1){
                    return count;
                }
            }
        }
        return count-1;
    }
}
