class Bitwise
{
	public static void main(String[] args)
	{
		int x,y,z;
		x=10;
		y=4;
		z=2;
		System.out.println(x&(y&z));
		System.out.println(x|(y|z));
		System.out.println(x<<(y|z));
		System.out.println(x>>(y^z));
	}
}
