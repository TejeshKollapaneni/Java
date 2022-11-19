import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args)//main method
	{
		int[] a=new int[4];//array declaration
		int[] b=new int[4];
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();//get the array elements
		}
		System.out.println("Duplicate array:");
		for(int i=0;i<=3;i++)
		{
		for(int j=i+1;j<=3;j++)
		{
			if(a[i]==a[j])//check the condition
			{
				b[i]=a[j];//assign value to b array
				System.out.println(b[i]+"   " +b[i]);//print duplicate array
			}
		}
	    }
	}
}	
