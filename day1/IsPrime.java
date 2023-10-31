package week2.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
			
		
		int num = 23;
		boolean flag = false;
		
		if (num<=1) {
			flag = true;
		}
		
		for(int i=2; i<=num/2; i++) {
			//condition for non prime number
			if(num%i==0) {
				flag= true;
				break;
			}			
		}		
		if(!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}



