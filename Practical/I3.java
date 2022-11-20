interface I1//inteface 1
{
	void add(int x,int y);//method
} 
interface I2//interface 2
{
    void sub(int x,int y);//method	
}
public class I3 implements I1,I2//keyword implements
{
	public void add(int x,int y)//implement add method
	{
		int z;
		z=x+y;
		System.out.println("The addition of two number is"+z);
	}
    public void  sub(int x,int y)//implement sub method
	{
        int z;
        z=x+y;
        System.out.println("The Subtraction of two number is:"+z);
	}

public static void main(String[] args)
{
    I3 i=new I3();//object creation
    i.add(3,4);
     i.sub(6,5);
}
}
