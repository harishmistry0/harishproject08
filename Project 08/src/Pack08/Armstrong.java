package Pack08;

import java.util.Scanner;

public class Armstrong 
{	
	public static void main(String[] args) 
	{
		int t, r, s= 0;
		System.out.println("Please enter the value");
		Scanner harish=new Scanner(System.in);
		int n=harish.nextInt();
		t=n;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			s=s+r*r*r;
		}
		if(t==s)
	         System.out.println(t+" is an armstrong number");
	      else
	         System.out.println(t+" is not an armstrong number");
	}

}

