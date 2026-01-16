/* For an array A = [1,3,6,4,1,2], the smallest possible integer (>0) that does not occur in A is 5. */

import java.util.*;
class FindMissingSmallestNumber{
	public static int findMissingSmallestNo(int[] arr){
		Set<Integer> hSet = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(arr[i]>0){
				hSet.add(arr[i]);
			}
		}
		int smallest = 1;
		while(hSet.contains(smallest)){
			smallest++;
		}
		return smallest;
	}
	public static void main(String[] args){
		int[] arr = new int[]{1,3,6,4,1,2};
		System.out.println("The missing number in arr : "+Arrays.toString(arr)+" is: "+findMissingSmallestNo(arr));
	}
}