package Selenium;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {
		Set<Character> set=new HashSet<Character>();
String str="milkman";
for(int i=0;i<str.length();i++)
{
	char charAt = str.charAt(i);
	if(set.contains(charAt))
	{
		System.out.println(charAt);
	}
	else
	{
		set.add(charAt);
	}
}

	}

}
