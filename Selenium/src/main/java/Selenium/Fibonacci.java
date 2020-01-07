package Selenium;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of terms");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,c=1;
		System.out.print(a + ""+b);
		for(int i=3;i<=n;i++)
		
		{
			 a = b;
	            b = c;
	            c = a + b;
	            System.out.print(c+" ");
			
		}

	}

}
