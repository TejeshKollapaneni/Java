import java.util.Scanner;
class Array6
{
	public static void main(String[] args)
	{
		int[] a=new int[4];
		int min=a[0];
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		a[0]=sc.nextInt();
		min=a[0];
		for(int i=1;i<=3;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<min)
			{
				min=a[i];
			}	
		}
		System.out.println("minimum elemnt:"+min);
		
	}
}
