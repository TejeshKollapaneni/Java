//write a pgm Abstract class using Hierarchial inheritance
abstract class Abs1//abstract class
{
	Abs1()
	{
		System.out.println("Abstract constuctor");
    }
	void show()
	{
	     System.out.println("non Abstract method");	
	}
}	
class Abs2 extends Abs1	
{
	void show1()//implementation
	{
	System.out.println("Hello Abstract class");
	}
}
class Abs4 extends Abs1	
{
	void show2()//implementation
	{
	System.out.println("Hello child class");
	}
}
public class Abs3
{
public static void main(String[] args)
{
Abs2 a=new Abs2();//object creation
Abs4 a1=new Abs4();
a.show();
a.show1();
a1.show();
a1.show2();	
}
}