// write a pgm using  final with static  keyword,final method
class Finaldemo1
{
	static final int x=10;//variable declaration using  static final keyword
	static void show()
	{
		System.out.println(x);
	}
	final void show1()//final method
	{
		System.out.println("Final method");
	}
public final static void main(String[] args)//main method also final "it is optional"
{
   Finaldemo f=new Finaldemo();
   Finaldemo1.show();//call static with  final  method
   f.show1();//call final method   
}
}
