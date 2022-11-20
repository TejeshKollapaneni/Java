class Unary
{
	public static void main(String[] args)
	{
		int x,y,z,m;
		x=2;
		y=++x;
		z=x++ + ++y;
		m=(x++ + ++x)+(y++ - z--);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(m);
	}
}
