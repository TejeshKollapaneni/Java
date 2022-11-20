sql query

create table students(sno int,sname varchar(20),marks int)

insert into students values(1,'regi',350),(2,'saki',400)

select * from students



jdbc program


package first;


import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Students12 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException, IOException
	{
		
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first1", "root", "admin");
			PreparedStatement stmt=con.prepareStatement("select * from students");
			
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2)+"   "+rs.getInt(3));
			}
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("the columnname is:"+rsmd.getColumnName(1));
			System.out.println("the columnname is:"+rsmd.getColumnName(2));
			System.out.println("the columnname is:"+rsmd.getColumnName(3));
			
			
			con.close();
			
			

	}

}
