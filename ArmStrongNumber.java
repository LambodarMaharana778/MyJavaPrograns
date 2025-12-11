/*WAP to check whether the given number is ARMSTRONG NUMBER or NOT
  Ex:- num = 153
       count = 3
	   Exponential of 3 = 3^3 = 27
	   Exponential of 5 = 5^3 = 125
	   Exponential of 1 = 1^3 = 1
	 sum = 27+125+1 == 153 (equal to the given number)
	 => 153 is a ARMSTRONG NUMBER...
	 */

import java.util.Scanner;
class  ArmStrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		int n = temp;
		int count = 0;

        //count the number..
		while (num>0)
		{
			num = num/10;
			count++;
		}

		//Extract each digit and find the sum of exponential
		while (temp>0)
		{
			int ld = temp%10;
			int expo = 1;
			for (int i=1;i<=count;i++)
			{
				expo = expo*ld;
			}
			System.out.println("The exponential value of the digit " + ld+ " = " + expo);
			sum = sum + expo;
		    temp = temp/10;
		}
         System.out.println("The sum of exponential value of the given number = " + sum);
		if (sum==n)
		{
			System.out.println(n+ " is a ARMSTRONG NUMBER..");
		}
		else
			System.out.println(n + " is not a ARMSTRONG NUMBER. ");
	}
}
