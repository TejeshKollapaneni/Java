//write a program using constructor overloading
//bank customer details
class Bankcustomer
{
	int accno;
	String atype;
	double amt;
	Bankcustomer()//no param constructor
	{
		accno=2019045;
		atype="depositor";
		amt=20000;
	}
    Bankcustomer(int x,String y,double z)//param constructor
	{
	   accno=x;
	   atype=y;
       amt=z;
	}
    void show()//print the details
	{
         System.out.println(accno+"   "+atype+"    "+amt);
    }
public static void main(String[] args)
{
   Bankcustomer s=new Bankcustomer();//no param object
   Bankcustomer s1=new Bankcustomer(2019678,"checkbalance",40000);//param object
   Bankcustomer s2=new Bankcustomer(2019456,"Withdraw",10000);//param object
   s.show();
   s1.show();
   s2.show();
}
}