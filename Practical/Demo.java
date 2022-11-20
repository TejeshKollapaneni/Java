sql query:

create employee table
create database first1

use first1

create table emp(eno int,ename varchar(20),sal int)

insert into emp values(1,'regi',20000),(2,'saki',19000)

select * from emp



java program to run using jdbc


package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
	//Class.forName("com.mysql.jdbc.driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first1", "root", "admin");
		Statement stmt=con.createStatement();
		int status=stmt.executeUpdate("insert into emp values(3,'sutha',30000)");
		if(status>0)
		System.out.println("1 row inserted");
		else
		System.out.println("insertion fail");
		con.close();
		
		
		
		
	}

}
