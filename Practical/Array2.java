import java.util.Scanner;
class Array2
{
	public static void main(String[] args)
	{
		int[] a=new int[4];
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array list:");
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]+"");
		}
	}
}
