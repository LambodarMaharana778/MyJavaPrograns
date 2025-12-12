import java.util.Scanner;
class Butterfly 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = sc.nextInt();

		for (int i=1;i<=n ;i++)
		{
			int num = 1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(num++);
			}
			for (int j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			int m =num-1;   //for printing 2nd part number
            for (int j=1;j<=i;j++)
            {
                System.out.print(m--);
            }
			System.out.println();
		}
		for (int i=n;i>=1 ;i--)
		{
			int num = 1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(num++);
			}
			for (int j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			int m =num-1;
            for (int j=1;j<=i;j++)
            {
                System.out.print(m--);
            }
			System.out.println();
		}
		
	}
}
