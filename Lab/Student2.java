class Student2//class name
{
	int sid;//data members
	String sname;
	int marks;
	void input(int x,String y,int z)//input method
	{
		sid=x;//assign the values
		sname=y;
		marks=z;
	}
    void output()//output method
	{
         System.out.println(sid+"  " +sname+"  "+marks);//print the details
	}
public static void main(String[] args)//main method
{
   Student2 s=new Student2();//object creation
   s.input(1,"regi",98);//give the input
   s.output();
}
}