//package name "anudip2"
//print the details from package "anudip"
package anudip2;//package creation
import anudip.Bankcustomer1;//import the package from anudip &class name Bankcustomer1
public class Bankcustomer2
{
	public static void main(String[] args)//main method
	{
		Bankcustomer1 b=new Bankcustomer1();//object creation
		b.get(123,"regi",12000);//give the input
		b.show();//call the method
	}
}