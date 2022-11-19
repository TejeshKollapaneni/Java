// write a pgm to reverse number
import java.util.Scanner;
class Reverse //class name "large"
{
	public static void main(String[] args)//main method
	{
		int n,m,rev=0,r;//variable declaration
		System.out.println("Enter the numbers:");//get the numbers using "Scanner class"
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();//get the numbers
		m=n;//assign n value to m
		do//using do while loop
		{
		   r=n%10;//using mod % operator
		   rev=(rev*10)+r;//initially rev=0
		   n=n/10;//n divided by 10
		}while(n>0);//check n>0
		if(m==rev)//check m equal to rev then only print this is reverse number
           System.out.println("reverse number is:"+m);			
		else 
			System.out.println("not a reverse number");//otherwise print not a reverse number
	}
}
