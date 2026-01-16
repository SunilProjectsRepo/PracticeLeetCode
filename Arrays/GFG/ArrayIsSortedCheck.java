/*
Check if an Array is Sorted

Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.

Examples: 

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
*/
import java.util.*;
class ArrayIsSortedCheck {
	public static boolean checkArraySorted(int[] arr){
		int n = arr.length;
		for(int i=1; i<n; i++){
			if(arr[i-1] > arr[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		if(checkArraySorted(arr)){
			System.out.println("The given arr "+Arrays.toString(arr)+ " is sorted");
		}
		else{
			System.out.println("The given arr "+Arrays.toString(arr)+ " is not sorted");
		}
	}
}