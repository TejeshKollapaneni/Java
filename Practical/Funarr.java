import java.util.Scanner;
class Funarr
{
	    void max()
		{
		int[] a=new int[4];
		int max=0;
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.println("Maximum elemnt:"+max);
		}
		public static void main(String[] args)
	    {
        Funarr f=new Funarr();
		f.max();
		}
}
