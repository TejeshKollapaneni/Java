sql query

delimiter $$

create procedure 'first1'.'studetails'
(in sno int,in sname varchar(20),in marks int))

begin

insert into students values(sno,sname,marks);

end $$



jdbc program


package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudensDemo {

	public static void main(String[] args)throws SQLException,ClassNotFoundException, IOException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first1", "root", "admin");
		Statement stmt=con.createStatement();
		CallableStatement cs=(CallableStatement) con.prepareCall("{call studetails(?,?,?)}");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter sno");
			String s1=br.readLine();
			int sno=Integer.parseInt(s1);
			System.out.println("Enter sname");
			String sname=br.readLine();
			System.out.println("Enter marks");
			String s3=br.readLine();
			int marks=Integer.parseInt(s3);
			cs.setInt(1, sno);
			cs.setString(2,sname);
			cs.setInt(3,marks);
			cs.executeUpdate();
			System.out.println("u want to add more details y/n" );
			String ans=br.readLine();
			if(ans.equals("n"))
				break;
		}
			
			System.out.println("success");
			con.close();
		
		
				
			
		}
		
		

	}
