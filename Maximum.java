import java.util.Scanner;
class Maximum
{
      int[] a=new int[4];
     void maxi()//maximum method
	 {
	 	int max=0;
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)//check the condition
			{
				max=a[i];//assign the value to max
			}	
		}
		System.out.println("Maximum elemnt:"+max);//print the max value
	}
	void  mini()//minimum method
	{
	    int min=a[0];
		System.out.println("Enter Array elements:");
		Scanner sc=new Scanner(System.in);
		a[0]=sc.nextInt();
		min=a[0];//assign first element to min
		for(int i=1;i<=3;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<min)//check the condition
			{
				min=a[i];//assign the value to min
			}	
		}
		System.out.println("minimum elemnt:"+min);//print the min value
	}
	public static void main(String[] args)
	{
		Maximum m=new Maximum();//object creation
		m.maxi();//calling maxi method
		m.mini();//calling mini method
	}
}
