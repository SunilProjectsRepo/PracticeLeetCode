/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

import java.util.*;

class TwoSum{
    public static int[] twoSum(int[] nums, int target){
		int complement = 0;
		Map<Integer, Integer> hMap = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			complement = target - nums[i];
			if(hMap.containsKey(complement)){
				return new int[]{i, hMap.get(complement)};
			}else{
				hMap.put(nums[i], i);
			}
		}
		return new int[]{};
    }
	public static void main(String[] args){
		int[] nums = new int[]{2,7,11,15};
		System.out.println("The original array is: "+Arrays.toString(nums));
		int[] res = twoSum(nums, 9);
		System.out.print("The output is: "+Arrays.toString(res));
	}
}