class Mythread extends Thread//class extends thread class
{
	public void run()//run method whenever start mth calling internally run mthd calling
	{
		System.out.println("Thread is running:");
	}
}
public class ThreadDemo
{
	public static void main(String[] args)
	{
		Mythread m1=new Mythread();//object creation
		Mythread m2=new Mythread();
		System.out.println("First Thread Name:"+m1.getName());//get the first thread name
		System.out.println("Second Thread Name:"+m2.getName());//get the second thread name
		m1.start();//thread is started
		m2.start();
		m1.setName("Regi");//change the thread name
		m2.setName("Saki");//change the thread name
		System.out.println("After invoking SetName() Thread Name:"+m1.getName());//after changing get the thread name 
		System.out.println("After invoking setName() Thread Name:"+m2.getName());
    }
}