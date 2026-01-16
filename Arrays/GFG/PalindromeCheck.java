/* Palindrome check */

import java.util.*;

class PalindromeCheck{
	public static boolean checkPalindrome(int num){
		if(num < 2) return false;
		if(num == 2) return true;
		if(num % 2 == 0) return false;
		for(int i=3; i<Math.sqrt(num); i++){
			if(num%i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		boolean flag = checkPalindrome(7);
		System.out.println("Is number palindrome ?:"+flag);
	}
}