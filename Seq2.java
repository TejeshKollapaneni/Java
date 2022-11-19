//write a sequence number
// 1  2  4  6  8.....
import java.util.Scanner;
class Seq2//class name Seq2
{
	public static void main(String[] args)//main method
	{
		int i=1,n;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);//get the number using scanner class
		n=sc.nextInt();//n=2
	    while(i<=20)//check the condition
		{ 
	        System.out.print(i);//print i value 
			i=i*n;//multiply i and n and stored it i
		}
	}
}
