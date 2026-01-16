/*
Generating All Subarrays

Given an array arr[], the task is to generate all the possible subarrays of the given array.

Examples: 

Input: arr[] = [1, 2, 3]
Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]

Input: arr[] = [1, 2]
Output: [ [1], [1, 2], [2] ]
*/
import java.util.*;

class GenerateSubArrays{
	public static List<List<Integer>> generateSubArrays(int[] arr){
		List<List<Integer>> result = new ArrayList<>();
		subarrays(arr, 0, 0, result);
		return result;
	}
	public static void subarrays(int[] arr, int start, int end, List<List<Integer>> result){
		if(end == arr.length) return;
		if(start>end){
			subarrays(arr, 0, end+1, result);
		}else{
			List<Integer> subarray = new ArrayList<>();
			for(int i=start; i<=end; i++){
				subarray.add(arr[i]);
			}
			result.add(subarray);
			subarrays(arr, start+1, end, result);
		}
	}
	public static void main(String[] args){
		int[] arr = {1,2,3};
		System.out.println("The original array is: "+Arrays.toString(arr));
		List<List<Integer>> res = generateSubArrays(arr);
		System.out.println("The output is: "+res);
	}
}