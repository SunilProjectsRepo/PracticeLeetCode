/* check Armstrong number */

import java.util.*;
class ArmstrongCheck {
	public static boolean checkArmstrong(int num){
		int x = len(num);
		int temp = num, sum = 0;
		while(temp != 0){
			int r = temp%10;
			sum += power(r,x);
			temp = temp/10;
		}
		return sum == num;
		
	}
	public static int len(int num){
		int t = 0;
		while(num != 0){
			t++;
			num = num/10;
		}
		return t;
	}
	public static int power(int x, int y){
		if(y==0) return 1;
		if(y%2 == 0)
			return power(x,y/2) * power(x, y/2);
		else
			return x * power(x,y/2) * power(x, y/2);
	}
	public static void main(String[] args){
		boolean flag = checkArmstrong(123); // 153, 9474 are armstrong
		System.out.println("Is Number is Armstrong number? "+flag);
	
	}

}