/*
Minimum cost to make array size 1 by removing larger of pairs

Given an array of n integers. We need to reduce size of array to one. We are allowed to select a pair of integers and remove the larger one of these two. This decreases the array size by 1. Cost of this operation is equal to value of smallest one. Find out minimum sum of costs of operations needed to convert the array into a single element.

Examples: 

Input: arr[]= [4 ,3 ,2 ]
Output: 4
Explanation: Choose (4, 2) so 4 is removed, new array = {2, 3}. Now choose (2, 3) so 3 is removed.  So total cost = 2 + 2 = 4.

Input: arr[]=[ 3, 4 ]
Output: 3
Explanation: choose (3, 4) so cost is 3. 

*/

import java.util.*;

class MinCost{
	public static int cost(int[] arr){
		int min=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]< min)
				min = arr[i];
		}
		return (arr.length-1) * min;
	}
	public static void main(String[] args){
		int[] arr = {4,3,2};
		System.out.println("The original array is: "+Arrays.toString(arr));
		int c = cost(arr);
		System.out.println("The minimum cost to make array size 1 by removing larger of pairs is: "+c);
	}
}