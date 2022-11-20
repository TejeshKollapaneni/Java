abstract class A//grandparent abstract class
{
	abstract void f1();//abstract method
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
}
abstract class B extends A//parent abstract class
{
    void f1()//implementation
	{
       System.out.println("method f1");
	}
}
class C extends B//child class
{
	void f2(char x, char y)
	{
		System.out.println(x+"  "+y);
	}	
}
public class Abstractdemo
{
    public static void main(String[] args)//main method
	{
        C obj=new C();//child class object 
        obj.add(2,3);// calling grandparent mtd
        obj.f1();//callig f1 mtd
		obj.f2('a','b');//calling child class method
	}
}
