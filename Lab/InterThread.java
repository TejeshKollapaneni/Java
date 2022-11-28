class Customer
{
	int amount=10000;//initial amount
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw...");
		if(this.amount<amount)//withdraw amount less than initial amount
		{
			System.out.println("Less balance; Waiting for deposit");
			try
			{
				wait();//waiting
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		this.amount-=amount;//condition is true take the amount and less the amount
		System.out.println("Withdraw completed");
	}
	synchronized void deposit(int amount)//deposit method
	{
		System.out.println("Going to Deposit..");
	     this.amount+=amount;//deposit the amount
		 System.out.println("Deposit completed");
		 notify();//which thread is waiting that thread is notify
	}
}
class InterThread
{
	public static void main(String[] args)
	{
		final Customer c=new Customer();//no inheritance using final
		new Thread()//anonymous thread class
		{
			public void run()
			{
				c.withdraw(15000);//calling withdarw method
			}
		}.start();//start the thread
		new Thread()//anonymous thread class
		{
			public void run()
			{
				c.deposit(10000);//calling withdepositmethod
			}
		}.start();//start the thread
	}
}
