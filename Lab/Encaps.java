//write a pgm using Encapsulation with "private member"
class Encaps1
{
	private int eid;//private member
	private String ename;//private member
	void setEid(int x)//setter 
	{
		eid=x;
	}
    int getEid()//getter
	{
		return eid;
	}
	void setEname(String x)//setter
	{
		ename=x;
	}
    String getEname()//getter
	{
		return ename;
	}
};
public class Encaps
{
	public static void main(String[] args)
	{
		Encaps1 e=new Encaps1();
		e.setEid(30);//setfield
		e.setEname("REGI");//setfield
		System.out.println(e.getEid()+"   "  +e.getEname());//print the details uging getter
	}
}