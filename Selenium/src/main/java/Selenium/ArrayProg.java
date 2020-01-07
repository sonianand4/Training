package Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		arr[0]=5;
		arr[1]=3;
		arr[2]=6;
		arr[3]=7;
		arr[4]=8;
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=6&&arr[i]!=7)
				{
					System.out.println(arr[i]);
				}
			}

	}

}
