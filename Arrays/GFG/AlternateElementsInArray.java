/* Alternate elements of an array
Given an array arr[], the task is to print every alternate element of the array starting from the first element.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: 10 30 50
Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).

Input: arr[] = [-5, 1, 4, 2, 12]
Output: -5 4 12
*/
import java.util.*;
import java.util.stream.Collectors;
class AlternateElementsInArray{
	public static List<Integer> getAlternates(int[] arr){
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<arr.length; i=i+2){
			result.add(arr[i]);
		}
		return result;
	}
	public static void main(String[] args){
		int[] arr = new int[]{10,20,30,40,50};
		List<Integer> res = getAlternates(arr);
		System.out.println("The original array is: "+Arrays.toString(arr));
		String finalArr = res.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println("The final array is: "+finalArr);

	}
}