package Pack08;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter the Value of a :");
		Scanner harish=new Scanner(System.in);
		int a=harish.nextInt();
		boolean prime=true;
		
		for (int i=2;i<=a/2;i++)
		{
		if(a%2==0)
		{
			prime=false;
			break;
		}
		}
		if (prime)
			System.out.println(a+" is a Prime Number");
		else
			System.out.println(a+" is not a Prime Number");
		
	}
}


