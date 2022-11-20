import java.util.Scanner;//scanner class
class Stuavg//class name
{
	public static void main(String[] args)//main method
	{
		int[] m=new int[5];//integer array
		int n;
		int total;//data members
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students:");
		n=sc.nextInt();//get the no of students
		System.out.println("Enter first stu marks:");//get first student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
	    total=m[0]+m[1]+m[2];//calculate total
	    System.out.println("total is"+total);
	    avg=total/3;//calculate average
		System.out.println("Average is:" +avg);
		System.out.println("Enter second stu marks:");//get second student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2];//calculate total
	    System.out.println("total is"+total);
	    avg=total/3;//calculate average
		System.out.println("Average is:" +avg);
		System.out.println("Enter third stu marks:");//get third student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2];//calculate total
	    System.out.println("total is"+total);
	    avg=total/3;//calculate average
		System.out.println("Average is:" +avg);
		System.out.println("Enter fourth stu marks:");//get fourth student marks
		for(int i=0;i<=n-1;i++)
		{
	     m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2];//calculate total
	   System.out.println("total is"+total);
	    avg=total/3;//calculate average
		System.out.println("Average is:" +avg);
		System.out.println("Enter fifth stu marks:");//get fifth student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2];//calculate total
	    System.out.println("total is"+total);
	    avg=total/3;//calculate average
		System.out.println("Average is:" +avg);
		}
}
