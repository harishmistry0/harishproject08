package Pack08;

public class Doubleloop 
{
	public static void main(String[] args) 
	{
		System.out.println("Table No. 1");
		System.out.println(" ");
		
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Table No. 2 ");
		System.out.println();
		
		int x=5;
		
		for (int i=1;i<=x;i++)
		{
			for (int j=x;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Table No. 3 ");
		System.out.println();
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Table No. 4 ");
		System.out.println();
		
		int y=1;
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(y++ + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Table No. 5 ");
		System.out.println();
		
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1; j<=5-i; j++)  
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)  
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Table No. 6 ");
		System.out.println();
		
		for(int i=0;i<=5;i++)
		{
			for (int j=5-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for (int j=0;j<2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
