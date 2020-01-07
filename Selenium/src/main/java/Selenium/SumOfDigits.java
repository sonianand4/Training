package Selenium;

public class SumOfDigits {
	public static int sumOfDigits(int n)
	{
		int lastdigit,sum=0;
		while(n>0)
		{
			
			lastdigit=n%10;
			sum=sum+lastdigit;
			n=n/10;
			
		}
		return sum;
		
	}
	public static void secondLargest(int[] a)
	{
	
		int largest=a[0];
		int secondlargest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondlargest=largest;
				largest=a[i];
			}
			else
			{
				if(a[i]>secondlargest && a[i]!=largest)
					secondlargest=a[i];
			}
				
		}
		
		System.out.println(secondlargest);
	}
	public static void secondSmallest(int[] a)
	{
		int smallest=a[0];
		int secondsmall=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				secondsmall=smallest;
				smallest=a[i];
			}
			else
			{
				if(a[i]<secondsmall && a[i]!=smallest)
					secondsmall=a[i];
			}
		}
		System.out.println(secondsmall);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		a[0]=17;
		a[1]=12;
		a[2]=50;
		a[3]=21;
		a[4]=29;
		int sum = sumOfDigits(723);
		System.out.println(sum);
		secondLargest(a);
		secondSmallest(a);

	}

}
