class Bike//parent class
{
	void run()//parent class method
	{
		System.out.println("The Bike is Running");
	}
}
class Tvs extends Bike//child class 
{
 	void run()//child class method
	{
		super.run();//super keyword refer to the parent class object
		System.out.println("The Tvs Bike is Running");
	}
}
public class Super1
{
  public static void main(String[] args)
  {
    Tvs t=new Tvs();//object creation
	t.run();
  }
}
