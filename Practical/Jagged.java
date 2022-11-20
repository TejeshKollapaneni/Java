class Jagged
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[1];
		a[2]=new int[5];
		//First array
		a[0][0]=10;
		a[0][1]=11;
		a[0][2]=12;
		//second array
		a[1][0]=13;
		//Third array
		a[2][0]=14;
		a[2][1]=15;
		a[2][2]=16;
		a[2][3]=17;
		a[2][4]=18;
		System.out.println("Jagged Array");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
		System.out.println();
		}
	}
}
