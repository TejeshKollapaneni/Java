import java.util.Scanner;
class Matrix//class name
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][2];//first array
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}	
		int[][] b=new int[2][2];//second array
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}	
		int[][] c=new int[2][2];//third array
		int ch;
		System.out.println("1 addition");//choices are there
			System.out.println("2 multiply");
			System.out.println("3 transpose");
			System.out.println("4 exit");
			System.out.println("Enter the choice:");
	         ch=sc.nextInt();
		switch(ch)//switch case
		{
			case 1:
			System.out.println("Addition of 2 Arrays:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];//add 2 arrays
				System.out.println(c[i][j]+" ");
			}
		}
         System.out.println();
		 break;
		 case 2:
		 System.out.println("Multiplication of 2 Arrays:");
		 for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				c[i][j]=0;
				for(int k=0;k<=1;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);//multiply 2 arrays
				}
				System.out.println(c[i][j]+" ");
			}
		}
         System.out.println();
		 break;
		 case 3:
		 System.out.println("Transpose matrix:");
		 for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
	                System.out.println(a[j][i]+" ");//transpose the a array
			}
		}
		System.out.println();
		break;
		 case 4: 
		 {
		 System.out.println("no choice exit");//there is no choice
		}
		}
	}
}
