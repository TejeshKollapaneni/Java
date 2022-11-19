//write a sequence number
// 1  4  7  10.....
import java.util.Scanner;
class Seq1//class name Seq1
{
	public static void main(String[] args)//main method
	{
		int i=1,n;//variable declaration and initialization
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);//get the number using scanner class
		n=sc.nextInt();//n=3
	    while(i<=30)//check the condition using while loop
		{ 
	        System.out.print(i);//print i value
			i=i+n;//increament 3
		}
	}
}
