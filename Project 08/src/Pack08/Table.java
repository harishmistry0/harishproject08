package Pack08;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the No. of Table");
		Scanner harish=new Scanner(System.in);	
		int T=harish.nextInt();
		System.out.println("The Table of "+T );
		
		for (int i=1;i<=10;i++) 
		{
			System.out.println(T+"x"+i+"=" +i*T);
		}
	}
}