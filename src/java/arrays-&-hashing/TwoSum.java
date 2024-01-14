/*
* @Question https://leetcode.com/problems/two-sum/
* @Level EASY
*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        //Tests
        TwoSum obj=new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(obj.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(obj.twoSum(new int[]{3,3}, 6)));
    }
}
