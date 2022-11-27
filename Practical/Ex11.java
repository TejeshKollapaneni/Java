class Ex11
{
 void check(int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Invlaid age");
		}
		else
			System.out.println("Valid age");
	}
	public static void main(String[] arg)
	{
		Ex11 e1=new Ex11();
		e1.check(19);
		
	try
	{
		int a[]={10,20,30};
		a[5]=60;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Success");
	}
	}
}
