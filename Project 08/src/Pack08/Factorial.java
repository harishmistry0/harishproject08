package Pack08;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the value of Factorial Number :");
		Scanner harish=new Scanner(System.in);
		int value=harish.nextInt();
		int result=1;
		
		for (int i=1;i<=value;i++)
		{
			result=result*i;
			
		}
		System.out.println("Factorial of a number "+value+" is " + result);
	}
	
}

