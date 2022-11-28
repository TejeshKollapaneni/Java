import java.io.*;//io package
class ReadPassword
{
	public static void main(String[] args)//main method
	{
		Console c=System.console();//console class
		System.out.println("Enter Password");
		char[] ch=c.readPassword();//read the password using readPassword()
		String pass=String.valueOf(ch);//converting char array into string
		System.out.println("Password is :" +pass);//print the password
	}
}