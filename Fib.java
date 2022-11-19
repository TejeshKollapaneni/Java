//write a pgm fibnacci series
//0 1 1 2 3 5  
class Fib//class name fib
{
	public static void main(String[] args)//main method
	{
		int f1=0,f2=1,f3;//initially f1=0,f2=1
		System.out.println(f1);//print f1 value
		System.out.println(f2);//print f2 value
		do//using do while loop
		{
			f3=f1+f2;//add f1 value and f2 value store in f3
			System.out.println(f3+"");//print f3 value
			f1=f2;//assign the f2 value to f1
			f2=f3;//assign the f3 value to f2
	    }while(f3<=60)//check the condition
	}
}
