import java.util.Scanner;//scanner class
class Student1//class name
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
	    total=m[0]+m[1]+m[2]+m[3]+m[4];//calculate total
	   // System.out.println("total is"+total);
	    avg=total/5;//calculate average
		//System.out.println("Average is:" +avg);
		for(int i=0;i<=n-1;i++)
		{
		if(m[i]>40)//check the mark is greater than 40
		{
			System.out.println("Result is pass");//print pass
			break;
		}
		else
		{
			System.out.println("Result is fail");//otherwise fail
			break;
		}
		}
		System.out.println("Enter second stu marks:");//get second student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2]+m[3]+m[4];//calculate total
	    //System.out.println("total is"+total);
	    avg=total/5;//calculate average
		//System.out.println("Average is:" +avg);
		for(int i=0;i<=n-1;i++)
		{
		if(m[i]>40)//check the mark is greater than 40
		{
			System.out.println("Result is pass");//print pass
			break;
		}
		else
		{
			System.out.println("Result is fail");//otherwise fail
			break;
		}
		}
		System.out.println("Enter third stu marks:");//get third student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2]+m[3]+m[4];//calculate total
	    //System.out.println("total is"+total);
	    avg=total/5;//calculate average
		//System.out.println("Average is:" +avg);
		for(int i=0;i<=n-1;i++)
		{
		if(m[i]>40)//check the mark is greater than 40
		{ 
			System.out.println("Result is pass");//print pass
			break;
		}
		else
		{
			System.out.println("Result is fail");//otherwise fail
			break;
		}
		}
		System.out.println("Enter fourth stu marks:");//get fourth student marks
		for(int i=0;i<=n-1;i++)
		{
	     m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2]+m[3]+m[4];//calculate total
	   // System.out.println("total is"+total);
	    avg=total/5;//calculate average
		//System.out.println("Average is:" +avg);
		for(int i=0;i<=n-1;i++)
		{
		if(m[i]>40)//check the mark is greater than 40
		{
			System.out.println("Result is pass");//print pass
			break;
		}
		else
		{
			System.out.println("Result is fail");//otherwise fail
			break;
		}
		}
		System.out.println("Enter fifth stu marks:");//get fifth student marks
		for(int i=0;i<=n-1;i++)
		{
		m[i]=sc.nextInt();
		}
		total=m[0]+m[1]+m[2]+m[3]+m[4];//calculate total
	    //System.out.println("total is"+total);
	    avg=total/5;//calculate average
		//System.out.println("Average is:" +avg);
		for(int i=0;i<=n-1;i++)
		{
		if(m[i]>40)//check the mark is greater than 40
		{
			System.out.println("Result is pass");//print pass
			break;
		}
		else
		{
			System.out.println("Result is fail");//otherwise fail
			break;
		}
		}
		
	}
}
