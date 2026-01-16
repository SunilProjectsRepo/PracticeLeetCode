/*
Rotate an Array - Clockwise or Right

Rotations in the array is defined as the process of rearranging the elements in an array by shifting each element to a new position. This is mostly done by rotating the elements of the array clockwise or counterclockwise.

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {5, 6, 1, 2, 3, 4}
Explanation: After first right rotation, arr[] becomes {6, 1, 2, 3, 4, 5} and after the second rotation, arr[] becomes {5, 6, 1, 2, 3, 4}

Input: arr[] = {1, 2, 3}, d = 4
Output: {3, 1, 2}
Explanation: The array is rotated as follows:
After first left rotation, arr[] = {3, 1, 2}
After second left rotation, arr[] = {2, 3, 1}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {3, 1, 2}
*/
import java.util.*;

class RotateArray {
	public static void rotateArr(int[] arr, int d){
		int n = arr.length;
		//Handle the case where d>size of array
		d = d%n;
		//Reverse the array
		reverse(arr, 0, n-1);
		//Reverse the first d elements
		reverse(arr, 0, d-1);
		//Reverse the remaining n-d elements
		reverse(arr, d, n-1);
	}
	public static void reverse(int[] arr, int start, int end){
		int left = start, right = end;
		while(left<right){
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}
	}
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5,6};
		int d = 2;
		System.out.println("The original array is: "+Arrays.toString(arr));
		rotateArr(arr, d);
		System.out.println("The final output array is: "+Arrays.toString(arr));
	}
}