import java.util.Scanner;//package
public class Scanner1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);//scanner class
		System.out.println("Enter integer value:");
		int n=sc.nextInt();//getting integer value
		System.out.println("Enter name :");
		String s=sc.next();//getting string value
		System.out.println("Enter double value:");
		double d=sc.nextDouble();//getting double value
		System.out.println("Enter boolean value:");
		boolean b=sc.nextBoolean();//getting bollen value
	}
}