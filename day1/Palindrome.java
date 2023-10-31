package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=12321;
		int output=0;
		
		for(int i=input;i>0;i=i/10) 
		{
			 int remainder=input%10;
			// System.out.println("Remainder = "+remainder);
			 output =(output *10 )+ remainder;
			 //System.out.println("Output = "+output);
		}
			
			if (input==output)
			{
				System.out.print( input +" is not a Palindrome");
			}else 
				
			{System.out.println(input +" is a Palindrome");}
	}

}
