/*
Move all Zeros to End of Array

Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

Examples: 

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.

*/
import java.util.*;

class PushZerosToEnd{
	public static void shiftZeros(int[] arr){
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] != 0){
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length){
			arr[count++] = 0;
		}
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		System.out.println("The original array is: "+Arrays.toString(arr));
		shiftZeros(arr);
		System.out.println("The output array is: "+Arrays.toString(arr));
	}

}