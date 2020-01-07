package Selenium;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFormat {
	public static int sumOfDigits(String input)
	{   
		String output="";
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			//output=output+input.charAt(i);
			//System.out.print(output);
			try
			{
				int parseInt = Integer.parseInt(String.valueOf(input.charAt(i)));
				sum=sum+parseInt;
			}
			catch(NumberFormatException e)
			{
				
			}
		}
		return sum;
	}
	


	

public static void main(String[] args)
{
	System.out.println("Enter the input");
	Scanner sc=new Scanner(System.in);
	String instring = sc.nextLine();
	int sumofdigits = sumOfDigits(instring);
	System.out.println(sumofdigits);
}
}
