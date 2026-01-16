/*
Minimum increment by k operations to make all equal

You are given an array of n-elements, you have to find the number of operations needed to make all elements of array equal. Where a single operation can increment an element by k. If it is not possible to make all elements equal print -1.

Example : 

Input : arr[] = {4, 7, 19, 16},  k = 3
Output : 10

Input : arr[] = {4, 4, 4, 4}, k = 3
Output : 0

Input : arr[] = {4, 2, 6, 8}, k = 3
Output : -1
*/

import java.util.*;

class MinOpsRequiredToMakeEqualNo{
	public static int minOps(int[] arr, int n, int k){
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			max = Math.max(max, arr[i]);
		}
		int res = 0;
		for(int i=0; i<arr.length; i++){
			if((max-arr[i])%k != 0){
				return -1;
			}else{
				res += (max-arr[i])/k;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] arr = new int[]{4, 7, 19, 16};
		System.out.println("The original array is: "+Arrays.toString(arr));
		System.out.println("The minimum no. of operations required to make all numbers equal is: "+minOps(arr, arr.length, 3));
	}
}