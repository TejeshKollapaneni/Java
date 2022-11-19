class Sum1
{
	int z;
 String sum(int x,int y)//sum function
{
	if(x==y)//check x==y
	{
		z=x+y;
		return "yes";//return yes
	}
	else
	{
	  return "stop";	//otherwise stop the process
	}
}
public static void main(String[] args)
{
    Sum1 s=new Sum1();//object cretion
	String t=s.sum(3,3);//you can give 2,4 result is stop
	//String r=s.sum(3,3);
	System.out.println(t);//print the result
	//System.out.println(r);
}
}
