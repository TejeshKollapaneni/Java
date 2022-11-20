class Fact
{
	int fact(int n)
	{
		if(n==1)
		{
		  return 1;
		}
		else
		{
			return n*fact(n-1);//recursive method
		}
	}
	public static void main(String[] args)
	{
		Fact f=new Fact();
		int t=f.fact(5);//call fact method
		System.out.println("The Factorial of 5 number is:"+t);
	}
}
