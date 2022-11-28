class Swapping
{
	void swap(int x,int y)//swap two integer number
	{
       int t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two number is:");
	    System.out.print(x+"   " +y);
		System.out.println();
	}
	void swap(double x,double y)//swap two  double number
	{
       double t;
	   t=x;
	   x=y;
	   y=t;
	   System.out.println("The Swapping of two double is:");
	   System.out.print(x+"  "+y);
	}
public static void main(String[] args)
{
    Swapping s=new Swapping();
	s.swap(10,20);//calling two integer number
	s.swap(54.5,89.5);//calling two double number
}
}
