//largest of 3 numbers
import java.util.Scanner;//scanner class
class Large //class name "large"
{
	public static void main(String[] args)//main method
	{
		int a,b,c;//variable declaration
		System.out.println("Enter the numbers:");//get the numbers using "Scanner class"
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();//a value
		b=sc.nextInt();//b value
		c=sc.nextInt();//c value
		if(a>b && a>c) // check a with b&c
			System.out.println(a+"is big");//print a value
		else if(b>a && b>c)//check b with a & c
			System.out.println(b+"is big");//print b value
		else if(c>a && c>b)//check c with a &b
			System.out.println(c+"is big");//print c value
		else//otherwise print else part
			System.out.println("All are equal");
	}
}
