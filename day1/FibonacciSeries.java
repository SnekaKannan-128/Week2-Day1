package week2.day1;

public class FibonacciSeries {
   
	public static void main(String[] args) {
		
		int n=8, firstNum=0, secondNum=1;
		System.out.println("Fibonacci Series till " + n + " terms: ");
		 // Fibonacci Series - every third number is equal to sum of previous two numbers
		
		for(int i=1; i<=n; i++) {
			System.out.print(firstNum + " ,");
			
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
		}
	}

}
