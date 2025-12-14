import java.util.Scanner;
class Largnumof2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		
		if (a>b)
		{
			System.out.println(a+"-A is largest Number..");
		}
		else
		{
			System.out.println(b+"-B is largest Number..");
		}
		
	}
}
