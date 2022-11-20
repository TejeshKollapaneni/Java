interface Abs1
{
	void swap(int x,int y);
	void show(char x,char y);
}
abstract class Abs2 implements Abs1
{
	public void swap(int x,int y)
	{
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println(x+"   "+y);
	}
}
class Abs3 extends Abs2
{
    public void show(char x,char y)
    { 
	    char z;
		z=x;
		x=y;
		y=z;
		System.out.println(x+"   "+y);
	}
}
public class Abs 
{
   public static void main(String[] args)
   {
      Abs1 a=new Abs3();
      a.swap(4,6);
     a.show('a','b');
   }
}
