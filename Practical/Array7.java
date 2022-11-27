import java.util.Scanner;
class Array7
{
	public static void main(String[] args)
	{
		int[] a=new int[4];
		int t;
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=3;i++)
		{
		for(int j=i+1;j<=3;j++)
		{
		     if(a[i]>a[j])
			 {
			   t=a[i];
			   a[i]=a[j];
			   a[j]=t;
			}
		}
		}
	     System.out.println("Sorted  Array:");
         for(int i:a)
		 {
		 System.out.println(i+"");
		 }
	}
}
