package Selenium;

public class ArmstrongNum {
	public static void armstrong(int n)
	{int lastdigit;
	int lastdigittopowofnoofdigits=1;
	int sum=0;
	int noofdigits = String.valueOf(n).length();
	int copyofnum=n;
		while(n>0)
		{
			int loopMultiply = 0;
			lastdigit=n%10;
			n=n/10;
			
			for (int i = 0; i < noofdigits; i++) {
				
			}
			
			sum=sum+lastdigit*lastdigit*lastdigit;
			
		}
		if(sum==copyofnum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(407);
		armstrong(153);

	}

}
