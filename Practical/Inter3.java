interface Inter1//inteface 1
{
	void detail();//method
}
class Inter2 implements Inter1	
{
	public void detail()//implement the method
	{
		System.out.println("Hai interface");
	}
}
public class Inter3
{
	public static void main(String[] args)
{
   Inter1 in=new Inter2();//upcasting
   in.detail();
}
}
