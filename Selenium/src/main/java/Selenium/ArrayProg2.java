package Selenium;

public class ArrayProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[4];
		s[0]="s";
		s[1]="o";
		s[2]="n";
		s[3]="i";
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		
int a=5;
int b=7;
a=a+b;
b=a-b;
a=a-b;
System.out.println("numbers after swapping are :"+a+","+b);
	}

}
