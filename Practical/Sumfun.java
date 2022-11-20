class Sumfun
{
	int sum(int x,int y)
	{
		int ch='a';
		if(ch=='y')
		{
		  return sum(x,y);
		}
		else
		{
			return x+y;//recursive method
		}
	}
	public static void main(String[] args)
	{
		Sumfun f=new Sumfun();
		int t=f.sum(5,2);//call fact method
		System.out.println("The sum of two number is:"+t);
	}
}
