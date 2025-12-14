import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if (n>0)
		{
			System.out.println(n+" is Positive number");
		}
		else
		{
			System.out.println(n+" is Negative number");
		}
	}
}
