package Selenium;

import java.util.Scanner;

public class ReverseWord {
public static String reverseString(String input)
{String[] words=input.split(" ");
String reversestring="";
String reverseword="";
String word;
for(int i=0;i<words.length;i++)
{
	reverseword="";
	word=words[i];
	//reversing each word
	for(int j=word.length()-1;j>=0;j--)
	{
		reverseword=reverseword+word.charAt(j);
	}
	reversestring=reversestring+reverseword+" ";
	
}
	return reversestring;
}
public static void main(String args[]) {
	System.out.println("Enter the input");
	Scanner sc=new Scanner(System.in);
	String instring=sc.nextLine();
	String reverseStr = reverseString(instring);
	System.out.println(reverseStr);
	
}
}
