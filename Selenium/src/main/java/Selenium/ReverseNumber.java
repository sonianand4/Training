package Selenium;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int lastdigit,rev=0;
		int copyofnum=n;
		while(n>0)
		{
			lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;	
		}
		System.out.println(rev);
		

	}

}
