package Pack08;

public class Fibnocci
{
	public static void main(String[] args) 
	{
		int a=1, b=2, c=0;
		System.out.println("Fibnocci series up to 12 Number as below :");
		System.out.print(a+" "+b);
		
		for (int i=3;i<=12;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;		
		}
	}
}
