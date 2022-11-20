class Casting//base class
{
	void m1()//base class method
	{
		System.out.println("Base class");
	}
}
class Cast extends Casting//inheritance keyword "extends"
{
	void m1()//derived class method
	{
		System.out.println("derived class");
	}
}
public class Castingdemo
{
   public static void main(String[] args)//main method
   {
     Casting c=new Cast();//upcasting
     c.m1();//child class method calling
	 Casting c1=new Casting();//parent class object
	 c1.m1();//calling base class method
	 System.out.println(c1 instanceof Casting);//using instanceof operator "true"
	 System.out.println(c instanceof Casting);//true
	 System.out.println(c1 instanceof Cast);
   }
}
